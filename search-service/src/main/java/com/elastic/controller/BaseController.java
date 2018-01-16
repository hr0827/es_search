package com.elastic.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elastic.service.pojo.Result;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by fangpeiyun on 2017/1/17.
 */
public class BaseController {

    protected void printJson(HttpServletResponse response, String jsonStr) throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        response.getWriter().write(jsonStr);
    }

    protected void printJson(HttpServletResponse response, JSONObject json) throws IOException {
        printJson(response, json.toJSONString());
    }

    protected void printJson(HttpServletResponse response, JSONArray json) throws IOException {
        printJson(response, json.toJSONString());
    }

    protected String assemReturn(String jsonStr, int status, String message) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", jsonStr);
//        jsonObject.put("status", status);
//        jsonObject.put("msg", message);
        Result result = new Result();
        result.setCode(status);
        result.setMessage(message);
        jsonObject.put("result", result);
        return jsonObject.toJSONString();
    }

    protected String assemReturn(JSONObject json, String message) {
        return assemReturn(json.toJSONString(), 200, message);
    }

    protected String assemReturn(String jsonStr, String message) {
        return assemReturn(jsonStr, 200, message);
    }


}
