package com.hm.spring.factoryspringdemo;

public class GetStringFromDb implements GetString{

	@Override
	public String getString() {
		return "数据库中获取的字符串";
	}
	

}
