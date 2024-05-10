package org.example.kaab.jenkins_project;

import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

@SpringBootTest
class JenkinsProjectApplicationTests {

	public static Logger logger  = LoggerFactory.getLogger(JenkinsProjectApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("Test case Executing...");
		assertEquals(true,true);
	}

}
