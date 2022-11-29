package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootAppApplicationTests {
	public static final Logger logger = LoggerFactory.getLogger(SpringBootAppApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("it's a test class");
		assertEquals(true,true);
	}

}
