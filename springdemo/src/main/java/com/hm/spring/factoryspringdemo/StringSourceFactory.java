package com.hm.spring.factoryspringdemo;

import java.net.URL;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class StringSourceFactory {

	public static GetString create() {
		GetString getString = null;
		// 读取系统配置文件
		try {
			String sourceName = parseXml();
			Class clz = Class.forName(sourceName);
			getString = (GetString) clz.newInstance();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getString;
	}

	private static String parseXml() throws DocumentException {
		// 解析XML
		SAXReader saxReader = new SAXReader();
		URL url = StringSourceFactory.class.getResource("/config.xml");
		Document doc = saxReader.read(url);
		Element rootEle = doc.getRootElement();
		Element dsEle = rootEle.element("datasource");
		String className = dsEle.attributeValue("class");
		return className;
	}

}
