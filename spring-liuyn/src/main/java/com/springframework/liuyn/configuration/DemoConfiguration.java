package com.springframework.liuyn.configuration;

import com.springframework.liuyn.beanfactory.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springframework.liuyn.*")
public class DemoConfiguration {

	@Bean
	public UserDao getUserDao(){
		return new UserDao();
	}
}
