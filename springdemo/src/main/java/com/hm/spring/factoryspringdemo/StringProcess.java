package com.hm.spring.factoryspringdemo;
/**
 * 间接依赖，组件重用性提高。
 * 字符串处理类
 * @author Administrator
 *
 */
public class StringProcess {
	private GetString getString;
	public StringProcess(GetString getString){
		this.getString = getString;
	}
	//处理字符串
	public String processString(){
		return "处理了"+this.getString.getString();
		
	}
}
