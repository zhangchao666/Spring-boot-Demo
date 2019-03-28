package com.example;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * same as CommandLineRunner (you can replace it) 
 * run() is called just before SpringApplication.run(…​) completes
 **/
@Component
public class MyBean implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
	}

}
