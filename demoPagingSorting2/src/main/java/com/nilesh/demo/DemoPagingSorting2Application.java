package com.nilesh.demo;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nilesh.demo.controller.myController;

@SpringBootApplication
public class DemoPagingSorting2Application {

	public static void main(String[] args) {
		
		new File(myController.uploadDirectory).mkdir();
		
		SpringApplication.run(DemoPagingSorting2Application.class, args);
	}
}
