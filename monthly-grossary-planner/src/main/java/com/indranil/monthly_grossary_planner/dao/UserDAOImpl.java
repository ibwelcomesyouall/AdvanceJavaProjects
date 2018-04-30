package com.indranil.monthly_grossary_planner.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.indranil.monthly_grossary_planner.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<User> getUsers() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query .. sort by last name
		Query<User> theQuery = currentSession.createQuery("from Users order by username",User.class);
		
		// execute query and get result list
		List<User> users = theQuery.getResultList();
		
		// return the results
		return users;
	}

	@Override
	public void saveUser(User theUser) {
		
		// get current hibernate session
		Session currentSession= sessionFactory.getCurrentSession();
		// save the customer
		currentSession.save(theUser);
		
	}

	@Override
	public User getUser(int theId) {
		
		//  get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		User theUser = currentSession.get(User.class, theId);
		
		return theUser;
	}

}

