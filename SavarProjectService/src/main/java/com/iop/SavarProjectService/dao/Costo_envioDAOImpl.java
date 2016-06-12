package com.iop.SavarProjectService.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.iop.SavarProjectService.dto.Costo_envio;

@Repository
public class Costo_envioDAOImpl implements Costo_envioDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(Costo_envioDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addCosto_envio(Costo_envio a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(a);
		logger.info("Costo_envio saved successfully, Costo_envio Details="+a);
		
	}

	@Override
	public void updateCosto_envio(Costo_envio a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(a);
		logger.info("Costo_envio saved successfully, Almancen Details="+a);
	}

	@Override
	public List<Costo_envio> listCosto_envios() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Costo_envio> Costo_enviosList = session.createQuery("from Costo_envio").list();
		for(Costo_envio a : Costo_enviosList){
			logger.info("Costo_envio List::"+a);
		}
		return Costo_enviosList;
	}

	@Override
	public Costo_envio getCosto_envioById(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Costo_envio a = (Costo_envio) session.load(Costo_envio.class, id);
		logger.info("Costo_envio loaded successfully, Costo_envio details="+a);
		return a;
	}

	@Override
	public void removeCosto_envio(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Costo_envio a = (Costo_envio) session.load(Costo_envio.class, id);
		if(null != a){
			session.delete(a);
		}
		logger.info("Costo_envio deleted successfully, Costo_envio details="+a);
		
	}
}
