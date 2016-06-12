package com.iop.SavarProjectService.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.iop.SavarProjectService.dto.Almacen;
@Repository
public class AlmacenDAOImpl implements AlmacenDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(AlmacenDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addAlmacen(Almacen a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(a);
		logger.info("Almacen saved successfully, Almancen Details="+a);
		
	}

	@Override
	public void updateAlmacen(Almacen a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(a);
		logger.info("Almacen saved successfully, Almancen Details="+a);
	}

	@Override
	public List<Almacen> listAlmacens() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Almacen> almacensList = session.createQuery("from Almacen").list();
		for(Almacen a : almacensList){
			logger.info("Almacen List::"+a);
		}
		return almacensList;
	}

	@Override
	public Almacen getAlmacenById(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Almacen a = (Almacen) session.load(Almacen.class, id);
		logger.info("Almacen loaded successfully, Almacen details="+a);
		return a;
	}

	@Override
	public void removeAlmacen(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Almacen a = (Almacen) session.load(Almacen.class, id);
		if(null != a){
			session.delete(a);
		}
		logger.info("Almacen deleted successfully, Almacen details="+a);
		
	}
}
