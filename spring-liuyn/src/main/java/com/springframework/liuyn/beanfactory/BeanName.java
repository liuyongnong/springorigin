package com.springframework.liuyn.beanfactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanName  {
	private int age;
	private String name;

	@Autowired
	private User user;


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void init(){
		System.out.println("初始化beanName成功");
	}

}
