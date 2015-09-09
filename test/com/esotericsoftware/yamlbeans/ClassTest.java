package com.esotericsoftware.yamlbeans;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class ClassTest {
	
	public static void main(String[] args) {
		try {
			String file = "D:\\Projects\\YamlBeans\\yamlbeans\\test\\contact.yml";
			readMap(file);
			readClass(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Map readMap(String file) throws YamlException, FileNotFoundException {
		YamlReader reader = new YamlReader(new FileReader(file));
		Map map = reader.read(Map.class);
	    System.out.println(map);
	    return map;
	}
	
	public static Object readClass(String file) throws YamlException, FileNotFoundException {
		YamlReader reader = new YamlReader(new FileReader(file));
		Contact contact = reader.read(Contact.class);;
		System.out.println("name: " + contact.name);
		System.out.println("age: " + contact.age);
		System.out.println("mobile_phone1: " + contact.mobile_phone1);
		System.out.println("mobile_phone2: " + contact.mobile_phone2);
		return contact;
	}
}
