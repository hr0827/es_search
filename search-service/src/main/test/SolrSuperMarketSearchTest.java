import com.alibaba.fastjson.JSONObject;
import com.elastic.service.pojo.Attrbute;
import com.elastic.util.HttpUtils;
import org.elasticsearch.index.query.MatchPhraseQueryBuilder;
import org.elasticsearch.index.query.MultiMatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;
import org.springframework.scheduling.concurrent.ExecutorConfigurationSupport;

import java.util.HashMap;
import java.util.Map;

public class SolrSuperMarketSearchTest {

    @Test
    public void SearchTest() {
        Map<String, Object> map = getSearchMap();
        JSONObject searchJson = (JSONObject) JSONObject.toJSON(map);
//		SearchBean bean = JSONObject.parseObject(searchJson.toJSONString(), SearchBean.class);
//		SearchService service = new SearchServiceImpl();
//		String returnStr = service.searchByBean(bean);
        //String s = HttpUtils.sendPost("http://s.gomehigo.hk/searchForPost", searchJson.toJSONString());
        String s = HttpUtils.sendPost("http://127.0.0.1:8082/s.action", searchJson.toJSONString());
     //String s = HttpUtils.sendPost("http://localhost:8081/searchForPost", "{\"filter\":{\"1989_spu_attr\":[\"7293_是\"],\"1991_sku_attr\":[\"7305_银色\"],\"price\":[\"0\",\"2147483647\"],\"1991_spu_attr\":[\"7295_金色\",\"7304_灰色\"]},\"isFacet\":false,\"page\":1,\"query\":\"手机\",\"size\":10}");
        System.out.println(s);
    }

    private Map<String, Object> getSearchMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("query", "多颜色");

//        Map<String, Object> filter = new HashMap<>();
//        filter.put("keyword", "套装");
//        filter.put("fgCatSecond", new String[]{"120"});
//        filter.put("fgCatThird", new String[]{"121"});
//        filter.put("brand", new String[]{"71912436"});
//        filter.put("catFirst", new Integer[]{111});
//        filter.put("catSecond", new Integer[]{111002});
//        filter.put("catThird", new String[]{"85"});
//		filter.put("country", new Integer[] { 2 });
//		filter.put("isMobilePrice", 1);
//		filter.put("isSelf", 1);
//		filter.put("isInStore", 0);
//		filter.put("promotType", new Integer[] { 1, 2 });
//		Attrbute a = new Attrbute();
//		a.setAttrbuteId(attrbuteId);
//		a.setAttrbuteValues(new Integer[] { 1, 2, 3, 4, 5 });
//		Attrbute a2 = new Attrbute();
//		a2.setAttrbuteId(2);
//		a2.setAttrbuteValues(new Integer[] { 1, 2, 3, 4, 5 });
//		filter.put("attr", new Attrbute[] { a, a2 });
//        filter.put("price", new String[]{"359"});
//        map.put("filter", filter);
//
       //map.put("sortField", Constants.PRODUCT_SALE_PRICE);


        Map<String, Object> filter = new HashMap<>();
        //filter.put("couponUseType", "1");
        filter.put("catFirst", new Integer[]{286});
        filter.put("catSecond", new Integer[]{311});
        filter.put("catThird", new Integer[]{536});

        Attrbute a1 = new Attrbute();
        a1.setAttrbuteId("dynamicFields.品牌_sku_attr");
        a1.setAttrbuteValues(new String[]{"诺基亚（NOKIA）"});

        Attrbute a2 = new Attrbute();
		a2.setAttrbuteId("dynamicFields.颜色-模板2使用_sku_attr");
		a2.setAttrbuteValues(new String[]{"黑色"});
		filter.put("attr", new Attrbute[] { a1,a2 });

        map.put("filter", filter);
       map.put("sortType", "1");
		map.put("page", 1);
		map.put("size", "10");
		map.put("isFacet", true);
        return map;
    }

    @Test
    public void getSearchBBSMap() {

        MatchPhraseQueryBuilder matchPhraseQueryBuilder = QueryBuilders.matchPhraseQuery("name", "中华人民共和国");

        System.out.println(matchPhraseQueryBuilder);
        System.out.println(  matchPhraseQueryBuilder.analyzer("ik_max_word"));

        System.out.println(QueryBuilders.matchQuery("name", "中华人民共和国").minimumShouldMatch("or").fuzziness(false));
        System.out.println("----------------------------------------------");
        System.out.println(QueryBuilders.multiMatchQuery("中华人民共和国", "name^3", "cat^2", "attr_name","*_user").type(MultiMatchQueryBuilder.Type.MOST_FIELDS));
        Map<String,Float> fieldMap = new HashMap<>();
        fieldMap.put("name",12f);
        fieldMap.put("title",15f);
        System.out.println(QueryBuilders.queryStringQuery("this AND that").fields(fieldMap));
        System.out.println("----------------------------------------------");
        System.out.println(QueryBuilders.queryStringQuery("the world").defaultField("content"));
        Map<String,Float> fieldMap1 = new HashMap<>();
        fieldMap1.put("name.*",12f);
        System.out.println(QueryBuilders.queryStringQuery("the world").fields(fieldMap1));


    }

    @Test
    public void printJson() {
        Map<String, Object> map = getSearchMap();
        JSONObject searchJson = (JSONObject) JSONObject.toJSON(map);
        System.out.println(searchJson.toJSONString());
    }
}
