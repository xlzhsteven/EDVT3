package com.xiaolong.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaolong.model.Chamber;
import com.xiaolong.svc.ChamberSvc;

public class Test {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
		ChamberSvc chamberSvc = (ChamberSvc) act.getBean("chamberSvc");
		
		Chamber chamber = new Chamber();
		chamber.setId(1);
		chamber.setLocation("home");
		chamber.setName("someName");
		
		//chamberSvc.addChamber(chamber);
		System.out.println(chamberSvc.listAll());
		System.out.println(chamberSvc.listAll().size());
	}

}
