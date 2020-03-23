package com.hm.spring.factoryspringdemo;

public class GetStringFromNet implements GetString {

	@Override
	public String getString() {
		return "网络上获取的字符串";
	}
}
