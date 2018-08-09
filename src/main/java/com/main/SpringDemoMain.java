package com.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Point;

public class SpringDemoMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		context.registerShutdownHook();
		Point point = context.getBean(Point.class);
		Point point2 = context.getBean(Point.class);
		Point point3 = context.getBean(Point.class);
		
		
		System.out.println(point);
		System.out.println(point2);
		System.out.println(point3);
		
	}

}
