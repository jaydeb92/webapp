package com.xworkz.calamities.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.calamities.entity.CalamitiesEntity;

@Component
public class CalamitiesDAOImpl implements CalamitiesDAO {
	@Autowired
	private SessionFactory factory;

	public CalamitiesDAOImpl() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	public void create(CalamitiesEntity entity) {
		System.out.println("invoked create method in CalamitiesDAOImpl" + entity);
		Session session = null;
		try {
			System.out.println("creating session object");
			session = factory.openSession();
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("End:create in CalamitiesDAOImpl" + entity);
		} catch (Exception e) {
			System.err.println("Exception in create method in CalamitiesDAOImpl " + e.getMessage());
			session.getTransaction().rollback();

		} finally {
			session.close();
			System.out.println("session closed");
		}

	}

}
