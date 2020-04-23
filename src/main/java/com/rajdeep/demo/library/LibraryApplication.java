package com.rajdeep.demo.library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {

	private static final Logger logger = LoggerFactory.getLogger(LibraryApplication.class);

	public static void main(String[] args) {
		logger.info("Begin logging Library Application-----!");
		SpringApplication.run(LibraryApplication.class, args);
	}

}
