package com.hm.spring.newspringdemo;

public class StringSuorceFactory {
	public static GetString create(int no){ 
		GetString getString = null;
		switch (no) {
		case 1:
			getString = new GetStringFromDb();
			break;
		case 2:
			getString = new GetStringFromFile();
			break;
		case 3:
			getString = new GetStringFromNet();
			break;
		case 4:
			getString = new GetStringFromXml();
			break;
		default:
			break;
		}
		return getString;
	}
}
