package com.wuppski.msNotification;

import org.springframework.boot.SpringApplication;

public class TestMsNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.from(MsNotificationApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
