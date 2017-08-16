package com.oocl.ita.gervajo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainNetwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		NetworkManager netMan = (NetworkManager) context.getBean("netMan");
		
		

	}

}
