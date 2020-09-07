package com.cxy.demo1;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo1 {
	
	@Resource(name="customerDao")
	private CustomerDao customerDao;
	
	@Test
	public void run1(){
		/*ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDaoImpl cs = (CustomerDaoImpl) ac.getBean("customerDao");*/
		customerDao.save();
		customerDao.update();
	}

}
