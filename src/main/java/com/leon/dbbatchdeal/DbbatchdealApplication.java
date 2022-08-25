package com.leon.dbbatchdeal;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@MapperScan(basePackages = {"com.leon.dbbatchdeal.dao"})
public class DbbatchdealApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbbatchdealApplication.class, args);
		log.info("启动完成");
	}

}
