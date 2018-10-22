package com.chandlertu.log4j2.examples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {

	private static final Logger logger = LogManager.getLogger("HelloWorld");

	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			logger.info("Hello, World!");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
