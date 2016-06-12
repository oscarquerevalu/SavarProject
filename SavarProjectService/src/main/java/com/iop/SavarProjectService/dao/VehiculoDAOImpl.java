package com.iop.SavarProjectService.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.iop.SavarProjectService.dto.Vehiculo;

@Repository
public class VehiculoDAOImpl implements VehiculoDAO{

	private static final Logger logger = LoggerFactory.getLogger(VehiculoDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addVehiculo(Vehiculo a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(a);
		logger.info("Vehiculo saved successfully, Vehiculo Details="+a);
		
	}

	@Override
	public void updateVehiculo(Vehiculo a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(a);
		logger.info("Vehiculo saved successfully, Almancen Details="+a);
	}

	@Override
	public List<Vehiculo> listVehiculos() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Vehiculo> VehiculosList = session.createQuery("from Vehiculo").list();
		for(Vehiculo a : VehiculosList){
			logger.info("Vehiculo List::"+a);
		}
		return VehiculosList;
	}

	@Override
	public Vehiculo getVehiculoById(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Vehiculo a = (Vehiculo) session.load(Vehiculo.class, id);
		logger.info("Vehiculo loaded successfully, Vehiculo details="+a);
		return a;
	}

	@Override
	public void removeVehiculo(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Vehiculo a = (Vehiculo) session.load(Vehiculo.class, id);
		if(null != a){
			session.delete(a);
		}
		logger.info("Vehiculo deleted successfully, Vehiculo details="+a);
		
	}	
	
	public String getNextId(){
		try{
			Session session = this.sessionFactory.getCurrentSession();
			org.hibernate.Transaction t = session.beginTransaction();
			String sequel = "Select max(idVehiculo) + 1 from Vehiculo";
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
