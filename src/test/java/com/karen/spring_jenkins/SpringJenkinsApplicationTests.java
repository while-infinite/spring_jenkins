package com.karen.spring_jenkins;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@Slf4j
class SpringJenkinsApplicationTests {

	@Test
	void contextLoads() {
		log.info("Test class executed");
		assertTrue(true);
	}

}
