package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@GetMapping("/welcome")
//	public ResponseEntity<String> getStarted() {
//
//		return new ResponseEntity<String>("<h1 style='color:red;'>Hello Yogee </h1> ", HttpStatus.OK);
//	}
//	
//	@GetMapping("/hi")
//	public ResponseEntity<String> get() {
//
//		return new ResponseEntity<String>("<h1 style='color:red;'>Good morning .........</h1> ", HttpStatus.OK);
//	}
	
//	@Bean
//	public Docket productApi() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("com")).build();
//	}
//	

}
