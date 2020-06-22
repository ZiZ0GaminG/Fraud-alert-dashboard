package com.milos.fraudalertdashboard.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {"com.milos.fraudalertdashboard.dashboard", "com.milos.fraudalertdashboard.dao"})
public class FraudAlertDashboard {

	  public static void main(String[] args)
	  {
		  SpringApplication.run(FraudAlertDashboard.class, args);
	  }
	}

