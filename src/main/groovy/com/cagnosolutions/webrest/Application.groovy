package com.cagnosolutions.webrest
import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
/**
 * Created by Scott Cagno.
 * Copyright Cagno Solutions. All rights reserved.
 */

@CompileStatic
@SpringBootApplication
public class Application {
	static void main(String... args) {
		SpringApplication.run Application, args
	}
}