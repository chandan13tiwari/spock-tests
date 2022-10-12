package com.example.spock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpockTestsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpockTestsApplication.class, args);
	}

	public int addition(int a, int b) {

		String str = "<head>\n" +
				"  <title>Intro To Programming: HTML Overview</title>\n" +
				"  <link rel=\"stylesheet\" href=\"style.css\">\n" +
				"  <meta charset=\"UTF-8\">\n" +
				"</head>\n" +
				"<body>";

		String textBlocks = """
				<head>
				  <title>Intro To Programming: HTML Overview</title>
				  <link rel="stylesheet" href="style.css">
				  <meta charset="UTF-8">
				</head>
				<body>
				""";
		return a+b;
	}

	public int divide(int a, int b) {
		return a/b;
	}

}
