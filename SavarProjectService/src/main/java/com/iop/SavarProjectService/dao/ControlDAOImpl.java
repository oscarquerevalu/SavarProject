package com.iop.SavarProjectService.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.iop.SavarProjectService.dto.Control;

@Repository
public class ControlDAOImpl implements ControlDAO{

	private static final Logger logger = LoggerFactory.getLogger(ControlDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addControl(Control a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(a);
		logger.info("Control saved successfully, Control Details="+a);
		
	}

	@Override
	public void updateControl(Control a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(a);
		logger.info("Control saved successfully, Almancen Details="+a);
	}

	@Override
	public List<Control> listControls() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Control> ControlsList = session.createQuery("from Control").list();
		for(Control a : ControlsList){
			logger.info("Control List::"+a);
		}
		return ControlsList;
	}

	@Override
	public Control getControlById(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Control a = (Control) session.load(Control.class, id);
		logger.info("Control loaded successfully, Control details="+a);
		return a;
	}

	@Override
	public void removeControl(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Control a = (Control) session.load(Control.class, id);
		if(null != a){
			session.delete(a);
		}
		logger.info("Control deleted successfully, Control details="+a);
		
	}
	
	public String getNextId(){
		try{
			Session session = this.sessionFactory.getCurrentSession();
			org.hibernate.Transaction t = session.beginTransaction();
			String sequel = "Select max(idControl) + 1 from Control";
			Query q = session.createQuery(sequel);
			List currentSeq = q.list();
			if(currentSeq == null){
				return "1";
			}else{
				return currentSeq.get(0).toString();
			}

		}catch(Exception exc){
			System.out.print("Unable to get latestID");
			exc.printStackTrace();

		}
		return "1";

	}


}
