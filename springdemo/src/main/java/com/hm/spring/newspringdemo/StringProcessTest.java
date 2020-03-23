package com.hm.spring.newspringdemo;

import java.util.Scanner;

/**
 * 字符串处理测试
 * @author Administrator
 *
 */
public class StringProcessTest {

	public static void main(String[] args) {
		GetString getString = null;
		System.out.println("请输入数据源：1.数据库 2.文件 3.网络 4.Xml");
		Scanner input = new Scanner(System.in);
		int no = input.nextInt();
		//简单工厂创建对象
		getString = StringSuorceFactory.create(no);
		//依赖注入
		StringProcess stringProcess = new StringProcess(getString);
		String proStr = stringProcess.processString();
		System.out.println(proStr);

	}

}
