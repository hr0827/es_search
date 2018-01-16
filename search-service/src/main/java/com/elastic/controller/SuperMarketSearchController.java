package com.elastic.controller;

import com.alibaba.fastjson.JSONObject;

import com.elastic.service.inter.SuperMarketSearchService;
import com.elastic.service.pojo.SearchBean;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLDecoder;
import java.nio.charset.Charset;

@Controller
public class SuperMarketSearchController extends BaseController {

    private static final Logger logger = Logger.getLogger(SuperMarketSearchController.class);

    @Resource(name = "superMarketSearchServiceImpl")
    private SuperMarketSearchService searchService;

    @RequestMapping(value = "/s.action")
    public String searchForPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            String param = getParam(request);
            logger.info("请求参数：" + param);
            SearchBean bean = JSONObject.toJavaObject(JSONObject.parseObject(param), SearchBean.class);
            bean.setQuery(bean.getQuery() != null ? URLDecoder.decode(bean.getQuery(), "UTF-8") : null);
            String re = searchService.searchByBean(bean);
            printReturnVal(response, re);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            printReturnVal(response, assemReturn("[]", 500, "系统异常,请检查参数：" + e.getMessage()));
        }
        return null;
    }



    @RequestMapping(value = "/suggest")
    public void suggest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String keyword = request.getParameter("keyword");
//        String newKeyWord="";
//        if (!StringUtils.isEmpty(keyword)){
//             newKeyWord = new String(keyword.getBytes("ISO-8859-1"), "UTF-8");
//        }
        SearchBean bean = new SearchBean();
       // bean.setQuery(newKeyWord==""?"********":newKeyWord);
        bean.setQuery(keyword);
        PrintWriter out = null;
        String suggests = searchService.suggestByBean(bean);
        printReturnVal(response, suggests);
    }

    private void printReturnVal(HttpServletResponse response, String returnVal) {
        PrintWriter out = null;
        try {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json");
            out = response.getWriter();
            System.out.println(returnVal);
            out.print(returnVal);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getParam(HttpServletRequest request) throws IOException {
        StringBuffer sb = new StringBuffer();
        InputStream is = request.getInputStream();
        InputStreamReader isr = new InputStreamReader(is, Charset.forName("UTF-8"));
        BufferedReader br = new BufferedReader(isr);
        String s = "";
        while ((s = br.readLine()) != null) {
            sb.append(s);
        }
        isr.close();
        br.close();
        String str = sb.toString();
        logger.info("requstParam=" + str);
        String param = "";
        JSONObject jsonObject = JSONObject.parseObject(str);
        if (jsonObject.getString("body") != null && !jsonObject.getString("body").isEmpty()) {
            param = jsonObject.getString("body");
        } else {
            param = str;
        }
        return param;
    }

}
