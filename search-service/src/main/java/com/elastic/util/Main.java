package com.elastic.util;

import java.io.UnsupportedEncodingException;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static final Logger LOGGER = Logger.getLogger(Main.class);

	private Main() {
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnsupportedEncodingException {

		AbstractApplicationContext context = null;
		LOGGER.info("\n========================================================="
				+ "\n                                                          "
				+ "\n   索引服务启动...                           		"
				+ "\n                                                          "
				+ "\n=========================================================");
		context = new ClassPathXmlApplicationContext("classpath:*-context.xml");
		context.registerShutdownHook();

		LOGGER.info("\n========================================================="
				+ "\n                                                          "
				+ "\n   索引服务启动[OK]                            "
				+ "\n                                                          "
				+ "\n=========================================================");
	}
}
