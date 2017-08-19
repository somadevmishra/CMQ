package com.cmq.DAO.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.cmq.DAO.UserDAO;
import com.cmq.model.User;

@Repository(value="userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public User getUser(Long id) {
		User user=new User();
		Criteria cr=sessionFactory.getCurrentSession().createCriteria(User.class);
		cr.add(Restrictions.idEq(id));
		if(cr.list()!=null && cr.list().size() > 0)
			user=(User)cr.list().get(0);
		return user;
	}

	@SuppressWarnings("unchecked")
	public List<User> getUserByName(String name) {
		// TODO Auto-generated method stub
		
		Criteria cr=sessionFactory.getCurrentSession().createCriteria(User.class);
		cr.add(Restrictions.like("first_name", name));
		if(cr.list()!=null && cr.list().size() > 0)
			return cr.list();
		return null;
	}

	public User getUserByEmailId(String emailId) {
		// TODO Auto-generated method stub
		User user=new User();
		Criteria cr=sessionFactory.getCurrentSession().createCriteria(User.class);
		cr.add(Restrictions.like("emailId", emailId));
		if(cr.list().size() > 0)
			user=(User)cr.list().get(0);
		return user;
	}

}
