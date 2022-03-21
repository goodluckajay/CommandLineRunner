package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner, ApplicationRunner {

	public static void main(String[] args) {
		System.out.println("main method");
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("run method");
		System.out.print("values are : " + args.length);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("run method11");
		System.out.println("another run method : " + args.getSourceArgs().length);
	}
}
