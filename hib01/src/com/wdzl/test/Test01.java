package com.wdzl.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wdzl.entity.School;

public class Test01 {

	public static void main(String[] args) {
		try {
			//���������ļ�
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
			//�����Ự����
			SessionFactory factory = cfg.buildSessionFactory();
			//�����Ựsession
			Session session = factory.openSession();
			
			//����������ѯ����
			School school = session.get(School.class, 1);
			System.out.println("==="+school);
			
			//�رջỰ
			session.close();
			//�رչ��� �ͷ���Դ
			factory.close();
		} catch (HibernateException e) { 
			e.printStackTrace();
		}
	}

}
