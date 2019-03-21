package com.ling;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Description: TODO
 * 
 * @author Lian
 * @Date Jan 30, 2019 4:23:10 PM 
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).run(args);
	}
}
