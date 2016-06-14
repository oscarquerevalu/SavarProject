package com.iop.SavarProjectService.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.iop.SavarProjectService.dto.Cliente_costo;

@Repository
public class Costo_envioDAOImpl implements Costo_envioDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(Costo_envioDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addCosto_envio(Cliente_costo a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(a);
		logger.info("Cliente_costo saved successfully, Cliente_costo Details="+a);
		
	}

	@Override
	public void updateCosto_envio(Cliente_costo a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(a);
		logger.info("Cliente_costo saved successfully, Almancen Details="+a);
	}

	@Override
	public List<Cliente_costo> listCosto_envios() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Cliente_costo> Costo_enviosList = session.createQuery("from Cliente_costo").list();
		for(Cliente_costo a : Costo_enviosList){
			logger.info("Cliente_costo List::"+a);
		}
		return Costo_enviosList;
	}

	@Override
	public Cliente_costo getCosto_envioById(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Cliente_costo a = (Cliente_costo) session.load(Cliente_costo.class, id);
		logger.info("Cliente_costo loaded successfully, Cliente_costo details="+a);
		return a;
	}

	@Override
	public void removeCosto_envio(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Cliente_costo a = (Cliente_costo) session.load(Cliente_costo.class, id);
		if(null != a){
			session.delete(a);
		}
		logger.info("Cliente_costo deleted successfully, Cliente_costo details="+a);
		
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
