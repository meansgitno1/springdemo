package com.hm.spring.factoryspringdemo;
/**
 * 获取文件中的字符串类
 * @author Administrator
 *
 */
public class GetStringFromFile implements GetString {

	@Override
	public String getString() {
		return "文件中获取的字符串";
	}
	
}
