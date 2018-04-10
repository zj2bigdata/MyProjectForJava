package com.testlog4j;

import java.io.InputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test {

	 public static void main(String[] args) { 
		InputStream in = Test.class.getResourceAsStream("/resources/log4j.properties");
		PropertyConfigurator.configure(in);
		Logger logger = Logger.getLogger(Test.class);
		logger.trace("trance��Ϣ");
		logger.debug("debug��Ϣ");
		logger.info("info��Ϣ");
		logger.error("error��Ϣ");
		logger.warn("warn��Ϣ");
	 }
		
}
