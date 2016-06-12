package com.iop.SavarProjectService.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.iop.SavarProjectService.dto.Resultado;

@Repository
public class ResultadoDAOImpl implements ResultadoDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(ResultadoDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addResultado(Resultado a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(a);
		logger.info("Resultado saved successfully, Resultado Details="+a);
		
	}

	@Override
	public void updateResultado(Resultado a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(a);
		logger.info("Resultado saved successfully, Almancen Details="+a);
	}

	@Override
	public List<Resultado> listResultados() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Resultado> ResultadosList = session.createQuery("from Resultado").list();
		for(Resultado a : ResultadosList){
			logger.info("Resultado List::"+a);
		}
		return ResultadosList;
	}

	@Override
	public Resultado getResultadoById(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Resultado a = (Resultado) session.load(Resultado.class, id);
		logger.info("Resultado loaded successfully, Resultado details="+a);
		return a;
	}

	@Override
	public void removeResultado(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Resultado a = (Resultado) session.load(Resultado.class, id);
		if(null != a){
			session.delete(a);
		}
		logger.info("Resultado deleted successfully, Resultado details="+a);
		
	}
}
