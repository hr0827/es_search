package com.elastic.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by fangpeiyun on 2017/3/29.
 */
@Component
public class SpringApplicationUtils implements ApplicationContextAware, DisposableBean {
    private static ApplicationContext applicationContext;

    @Override
    public void destroy() throws Exception {
        SpringApplicationUtils.clearHolder();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringApplicationUtils.applicationContext = applicationContext;
    }

    /**
     * getbean
     *
     * @param requireType
     * @return
     */
    public static <T> T getBean(Class<T> requireType) {
        return applicationContext.getBean(requireType);
    }

    /**
     * getbean
     *
     * @param name
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) {
        return (T) applicationContext.getBean(name);
    }

    /**
     * clear context
     */
    private static void clearHolder() {
        applicationContext = null;
    }
}
