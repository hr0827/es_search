package com.elastic.util;

public class Constants {

    public static final String TRUE = "true";
    public static final String FALSE = "false";
    public static final String AND = "AND";
    public static final String OR = "OR";
    public static final String DEFAULT_QUERY_STR = "*:*";
    public static final String COLON = ":";
    public static final String LEFT_BRACKET = "[";
    public static final String TO = "TO";
    public static final String RIGHT_BRACKET = "]";
    public static final int DEFAULT_SIZE = 10;
    public static final String BLANK = " ";
    public static final String ASTERISK = "*";
    public static final String QUERY_OPTION = "q.op";
    public static final String NOT_IN = "-";

    public static final String QUERY = "query";
    public static final String BRAND = "brand_id";
    public static final String BRAND_NAME = "brand";
    public static final String SHOP_ID = "shop_id";
    public static final String CATEGORY_PRE = "category_";
    public static final String CATEGORY_FIRST = "category_first_id";
    public static final String CATEGORY_FIRST_NAME = "category_first";
    public static final String CATEGORY_FIRST_SIMPLE = "catFirst";
    public static final String CATEGORY_SECOND = "category_second_id";
    public static final String CATEGORY_SECOND_NAME = "category_second";
    public static final String CATEGORY_SECOND_SIMPLE = "catSecond";
    public static final String CATEGORY_THIRD = "category_third_id";
    public static final String CATEGORY_THIRD_NAME = "category_third";

    public static final String FG_CATEGORY_FIRST = "fg_cat_first_id";
    public static final String FG_CATEGORY_FIRST_NAME = "fg_cat_first";
    public static final String FG_CATEGORY_SECOND = "fg_cat_second_id";
    public static final String FG_CATEGORY_SECOND_NAME = "fg_cat_second";
    public static final String FG_CATEGORY_THIRD = "fg_cat_third_id";
    public static final String FG_CATEGORY_THIRD_NAME = "fg_cat_third";

    public static final String _ATTR = "_attr";
    public static final String COUNTRY_ID = "country_id";
    public static final String COUNTRY = "country";
    public static final String IS_IN_STORE = "is_in_store";
    public static final String IS_MOBILE_PRICE = "is_mobile_price";
    public static final String IS_SUIT = "is_suit";
    public static final String SHOP_FLAG = "shop_flag";
    public static final String IS_SELF = "is_self";
    public static final String IS_SKU = "is_sku";
    public static final String IS_SHELVES = "is_shelves";
    public static final String ADVER = "adver";
    public static final String PROMOT_TYPE = "promot_type";
    public static final String PRODUCT_PROTO_PRICE = "product_proto_price";
    public static final String PRODUCT_SALE_PRICE = "product_sale_price";
    public static final String PRODUCT_PC_PROTO_PRICE = "product_pc_proto_price";
    public static final String PRODUCT_PC_SALE_PRICE = "product_pc_sale_price";
    public static final String PRICE_CH = "价格";
    public static final String SPU = "spu";
    public static final String SKU = "sku";
    public static final String GOME_SKU = "gome_sku";
    public static final String PRODUCT_CH = "product_ch";
    public static final String GOOD_COMMENT_RATE = "good_comment_rate";
    public static final String PRODUCT_IMG = "product_img";
    public static final String PRODUCT_PRICE_SIMPLE = "price";
    //拼音
    public static final String NAME = "name";

    public static final String PC = "pc";
    public static final String IOS = "IOS";
    public static final String ANDROID = "android";
    public static final String WAP = "wap";

    //bbs
    public static final String BBS_ID = "id";
    public static final String CATEGORY_ID = "categoryId";
    public static final String COMMUNITY_NAME = "communityName";
    public static final String COMMUNITY_SUMMARY = "communitySummary";
    public static final String SURFACE = "surface";
    public static final String LIKE = "like";
    public static final String COLLECT = "collect";
    public static final String CREATE_TIME = "createTime";
    public static final String CATS = "cat1_cat2_cat3";
    public static final String CAT1 = "cat1";
    public static final String CAT2 = "cat2";
    public static final String CAT3 = "cat3";
    public static final String CAT_LIST = "cats";
    public static final String CATEGORY_FIRSTS = "category_firsts";
    public static final String CATEGORY_SECONDS = "category_seconds";
    public static final String ACTIVITY_IDS = "activityIds";
    public static final String CATS_STAR = "*_*_*";



    public enum KeyEnum {

        BRANDEN("brand", "品牌"),
        CATEGORYEN("catThird", "分类"),
        COUNTRYEN("country", "国家"),
        CATEGORY_FIRSTS("category_firsts", "一级分类"),
        CATEGORY_SECONDS("category_seconds", "二级分类"),
        CATEGORY_THIRD("category_third_id", "三级分类ID");

        private String key;
        private String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        KeyEnum(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public enum SymbolEnum {
        PLUS('+', "%2b"),
        MINUS('-', "%2b"),
        SLASH('\\', "%5c"),
        SIGH('!', "\\!"),
        LEFT_BRACKET('(', "\\("),
        RIGHT_BRACKET(')', "\\)"),
        COLON(':', "%3a"),
        UP_ANGLE_BRACKET('^', "%5e"),
        LEFT_MID_BRACKET('[', "%5b"),
        RIGHT_MID_BRACKET(']', "%5d"),
        DOUBLE_QUOTE('\"', "%22"),
        LEFT_BRACE('{', "%7b"),
        RIGHT_BRACE('}', "%7d"),
        TILDE('~', "%7e"),
        ASTERISK('*', "\\*"),
        QUESTION_MARK('?', "%3f"),
        VERTICAL_BAR('|', "%7c"),
        BITWISE_AND('&', "%26"),
        SEMICOLON(';', "%3b"),
        RIGHT_DIAGONAL('/', "%2f");

        private char symbol;
        private String enStr;

        SymbolEnum(char symbol, String enStr) {
            this.symbol = symbol;
            this.enStr = enStr;
        }

        public char getSymbol() {
            return symbol;
        }

        public void setSymbol(char symbol) {
            this.symbol = symbol;
        }

        public String getEnStr() {
            return enStr;
        }

        public void setEnStr(String enStr) {
            this.enStr = enStr;
        }

        public static String getEnStrBySymbol(char symbol) {
            for (SymbolEnum symbolEnum : SymbolEnum.values()) {
                if (symbolEnum.getSymbol() == symbol) {
                    return symbolEnum.getEnStr();
                }
            }
            return String.valueOf(symbol);
        }
    }

    public static void main(String[] args) {
        String a = "68:3E:34:28:FE:59";
        System.out.println(a.toLowerCase().replaceAll(":", ""));
    }
}
