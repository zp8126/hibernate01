package com.wdzl.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wdzl.entity.School;

public class Test01 {

	public static void main(String[] args) {
		try {
			//加载配置文件
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
			//创建会话工厂
			SessionFactory factory = cfg.buildSessionFactory();
			//创建会话session
			Session session = factory.openSession();
			
			//根据主键查询对象
			School school = session.get(School.class, 1);
			System.out.println("==="+school);
			
			//关闭会话
			session.close();
			//关闭工厂 释放资源
			factory.close();
		} catch (HibernateException e) { 
			e.printStackTrace();
		}
	}

}
