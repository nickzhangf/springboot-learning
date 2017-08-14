package com.zf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zf.mapper")
@SpringBootApplication
public class DuridDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuridDemoApplication.class, args);
	}
}
