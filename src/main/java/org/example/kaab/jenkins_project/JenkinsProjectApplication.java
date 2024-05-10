package org.example.kaab.jenkins_project;

import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsProjectApplication {
	public static Logger logger  = LoggerFactory.getLogger(JenkinsProjectApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application Started.....");
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsProjectApplication.class, args);
	}

}
