package com.niit.kafonbackend.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.kafonbackend.model.Login;
import com.niit.kafonbackend.model.Register;



@Transactional
@Repository
public class RegisterDAOImpl implements RegisterDAO {
	@Autowired
	SessionFactory sessionFactory;
	public void addUser(Register reg)
	{
		System.out.println("Registering DAO ");
		System.out.println(reg.getUserId());
		Login lc=new Login();
		lc.setUsername(reg.getUserId());
		lc.setPassword(reg.getPassword());
		System.out.println("Login Credentials");
		try
		{
		 Session session=sessionFactory.openSession();
		 Transaction tx=session.beginTransaction();
		 //tx.begin();
		 session.save(reg);
		 session.save(lc);
		 tx.commit();
		 session.flush();
		 session.close();
	    }
		catch(Exception ex)
		{
			System.out.println("Error " +ex);
		}
	}
	public Register getInfo(String lc)
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.getTransaction();
		tx.begin();
		Register logobj=(Register)session.get(Register.class, lc);
		System.out.println(logobj.getUserId());
		tx.commit();
		return logobj;
	}
	public Register getRegisterByUserId(String userId) {
		Session session=sessionFactory.getCurrentSession();
		Register register=(Register)session.createQuery("from Supplier where id="+userId).getSingleResult();
		return register;
	}
}
