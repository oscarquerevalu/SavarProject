package com.iop.SavarProjectService.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.iop.SavarProjectService.dto.Cliente;

@Repository
public class ClienteDAOImpl implements ClienteDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(ClienteDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addCliente(Cliente a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(a);
		logger.info("Cliente saved successfully, Cliente Details="+a);
		
	}

	@Override
	public void updateCliente(Cliente a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(a);
		logger.info("Cliente saved successfully, Almancen Details="+a);
	}

	@Override
	public List<Cliente> listClientes() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Cliente> ClientesList = session.createQuery("from Cliente").list();
		for(Cliente a : ClientesList){
			logger.info("Cliente List::"+a);
		}
		return ClientesList;
	}

	@Override
	public Cliente getClienteById(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Cliente a = (Cliente) session.load(Cliente.class, id);
		logger.info("Cliente loaded successfully, Cliente details="+a);
		return a;
	}

	@Override
	public void removeCliente(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Cliente a = (Cliente) session.load(Cliente.class, id);
		if(null != a){
			session.delete(a);
		}
		logger.info("Cliente deleted successfully, Cliente details="+a);
		
	}
	
	public String getNextId(){
		try{
			Session session = this.sessionFactory.getCurrentSession();
			org.hibernate.Transaction t = session.beginTransaction();
			String sequel = "Select max(idCliente) + 1 from Cliente";
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
