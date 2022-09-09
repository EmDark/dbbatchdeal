package com.leon.dbbatchdeal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;


class DbbatchdealApplicationTests {
	@Test
	  void dd() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");

		Integer dateInt=20220315;
		LocalDate localDateTime= LocalDate.parse(dateInt.toString(),dateTimeFormatter);
		localDateTime=localDateTime.minusDays(1L);
		System.out.println(localDateTime.format(dateTimeFormatter));
	}
	@Test
	void contextLoads() {
	}

}
