package com.wiley.beginningspring.ch2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//这里将文件放入src/main/resources内，可以之间通过ClassPathXmlApplicationContext获取
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ch2-beans.xml");
		AccountService accountService = applicationContext.getBean("accountServiceImpl", AccountService.class);

		System.out.println("Before money transfer");
		System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());		
		
		accountService.transferMoney(1, 2, 5.0);
		
		System.out.println("After money transfer");
		System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());

	}

}
