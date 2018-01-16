package com.elastic.common.constants;

/**
 * Created by fangpeiyun on 2017/5/24.
 */
public class EnumEntity {

    public enum activity {
        LIMIT_BUY(2, 1),//限时购
        NEW_EXCLUSIVE(4, 2);//新人专享

        activity(int v1, int v2) {
            this.v1 = v1;
            this.v2 = v2;
        }

        private int v1;
        private int v2;

        public int getV1() {
            return v1;
        }

        public void setV1(int v1) {
            this.v1 = v1;
        }

        public int getV2() {
            return v2;
        }

        public void setV2(int v2) {
            this.v2 = v2;
        }

        public static int getV2ByV1(int v1) {
            for (activity activity : activity.values()) {
                if (activity.getV1() == v1) {
                    return activity.getV2();
                }
            }
            return 0;
        }
    }
}
