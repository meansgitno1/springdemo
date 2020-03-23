package com.hm.spring.springdemo;
/**
 * 直接依赖，组件重用性提高。
 * 字符串处理类
 * @author Administrator
 *
 */
public class StringProcess {
	private GetStringFromFile getStringFromFile;
	//处理字符串
	public String processString(){
		return "处理了"+this.getStringFromFile+"字符串";
		
	}
}
