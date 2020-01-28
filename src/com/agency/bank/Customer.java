package com.agency.bank;

import java.sql.Timestamp;

public class Customer {
	
	private Integer age;
	private String name;
	private Long order;
	
	public Customer(String name, Integer age) {
		this.name = name;
		this.age = age;
		this.order = new Timestamp(System.nanoTime()).getTime();
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getOrder() {
		return order;
	}
	
	public void setOrder(Long order) {
		this.order = order;
	}
	
}
