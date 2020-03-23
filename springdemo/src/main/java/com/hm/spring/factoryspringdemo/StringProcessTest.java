package com.hm.spring.factoryspringdemo;

/**
 * 字符串处理测试
 * @author Administrator
 *
 */
public class StringProcessTest {

	public static void main(String[] args) {
		GetString getString = null;
		//简单工厂创建对象
		getString = StringSourceFactory.create();
		//依赖注入
		StringProcess stringProcess = new StringProcess(getString);
		String proStr = stringProcess.processString();
		System.out.println(proStr);

	}

}
