package com.iop.SavarProjectService.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.iop.SavarProjectService.dto.Cliente_sucursal;

@Repository
public class Cliente_sucursalDAOImpl implements Cliente_sucursalDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(Cliente_sucursalDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addCliente_sucursal(Cliente_sucursal a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(a);
		logger.info("Cliente_sucursal saved successfully, Cliente_sucursal Details="+a);
		
	}

	@Override
	public void updateCliente_sucursal(Cliente_sucursal a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(a);
		logger.info("Cliente_sucursal saved successfully, Almancen Details="+a);
	}

	@Override
	public List<Cliente_sucursal> listCliente_sucursals() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Cliente_sucursal> Cliente_sucursalsList = session.createQuery("from Cliente_sucursal").list();
		for(Cliente_sucursal a : Cliente_sucursalsList){
			logger.info("Cliente_sucursal List::"+a);
		}
		return Cliente_sucursalsList;
	}

	@Override
	public Cliente_sucursal getCliente_sucursalById(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Cliente_sucursal a = (Cliente_sucursal) session.load(Cliente_sucursal.class, id);
		logger.info("Cliente_sucursal loaded successfully, Cliente_sucursal details="+a);
		return a;
	}

	@Override
	public void removeCliente_sucursal(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Cliente_sucursal a = (Cliente_sucursal) session.load(Cliente_sucursal.class, id);
		if(null != a){
			session.delete(a);
		}
		logger.info("Cliente_sucursal deleted successfully, Cliente_sucursal details="+a);
		
	}
	
	
}
