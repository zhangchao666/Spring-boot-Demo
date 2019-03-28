package com.example;
import java.io.File;
import java.io.FileNotFoundException;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class Example {

	@RequestMapping("/")
	String home() {
		try {
			File file = ResourceUtils.getFile("classpath:banner.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return "fuck the waaad!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}

}
