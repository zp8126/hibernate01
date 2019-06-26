package com.wdzl.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wdzl.entity.School;

/**
 *	 保存数据到数据库
 *
 */
public class Test02 {

	public static void main(String[] args) {
		try {
			//加载配置文件
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
			//创建会话工厂
			SessionFactory factory = cfg.buildSessionFactory();
			//创建会话session
			Session session = factory.openSession();
			//开启事务
			Transaction tran = session.beginTransaction();
			
			//实例化对象
			School school = new School();
			school.setScname("Java一中");
			school.setAddress("Java三路");
			
			//持久化
			session.save(school);
			
			//提交事务
			tran.commit();
			
			//关闭会话
			session.close();
			//关闭工厂 释放资源
			factory.close();
		} catch (HibernateException e) { 
			e.printStackTrace();
		}
	}

}
