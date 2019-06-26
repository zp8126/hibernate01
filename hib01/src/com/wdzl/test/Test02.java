package com.wdzl.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wdzl.entity.School;

/**
 *	 �������ݵ����ݿ�
 *
 */
public class Test02 {

	public static void main(String[] args) {
		try {
			//���������ļ�
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
			//�����Ự����
			SessionFactory factory = cfg.buildSessionFactory();
			//�����Ựsession
			Session session = factory.openSession();
			//��������
			Transaction tran = session.beginTransaction();
			
			//ʵ��������
			School school = new School();
			school.setScname("Javaһ��");
			school.setAddress("Java��·");
			
			//�־û�
			session.save(school);
			
			//�ύ����
			tran.commit();
			
			//�رջỰ
			session.close();
			//�رչ��� �ͷ���Դ
			factory.close();
		} catch (HibernateException e) { 
			e.printStackTrace();
		}
	}

}
