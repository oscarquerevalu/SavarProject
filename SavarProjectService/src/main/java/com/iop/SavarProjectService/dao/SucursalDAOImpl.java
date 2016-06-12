package com.iop.SavarProjectService.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.iop.SavarProjectService.dto.Sucursal;

@Repository
public class SucursalDAOImpl implements SucursalDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(SucursalDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addSucursal(Sucursal a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(a);
		logger.info("Sucursal saved successfully, Sucursal Details="+a);
		
	}

	@Override
	public void updateSucursal(Sucursal a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(a);
		logger.info("Sucursal saved successfully, Almancen Details="+a);
	}

	@Override
	public List<Sucursal> listSucursals() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Sucursal> SucursalsList = session.createQuery("from Sucursal").list();
		for(Sucursal a : SucursalsList){
			logger.info("Sucursal List::"+a);
		}
		return SucursalsList;
	}

	@Override
	public Sucursal getSucursalById(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Sucursal a = (Sucursal) session.load(Sucursal.class, id);
		logger.info("Sucursal loaded successfully, Sucursal details="+a);
		return a;
	}

	@Override
	public void removeSucursal(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Sucursal a = (Sucursal) session.load(Sucursal.class, id);
		if(null != a){
			session.delete(a);
		}
		logger.info("Sucursal deleted successfully, Sucursal details="+a);
		
	}
	
	public String getNextId(){
		try{
			Session session = this.sessionFactory.getCurrentSession();
			org.hibernate.Transaction t = session.beginTransaction();
			String sequel = "Select max(idSucursal) + 1 from Sucursal";
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
