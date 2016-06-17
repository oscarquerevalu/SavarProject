package com.iop.SavarProjectService.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.iop.SavarProjectService.dto.Producto;

@Repository
public class ProductoDAOImpl implements ProductoDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(ProductoDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addProducto(Producto a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(a);
		logger.info("Producto saved successfully, Producto Details="+a);
		
	}

	@Override
	public void updateProducto(Producto a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(a);
		logger.info("Producto saved successfully, Almancen Details="+a);
	}

	@Override
	public List<Producto> listProductos() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		List<Producto> ProductosList = session.createQuery("from Producto").list();
		for(Producto a : ProductosList){
			logger.info("Producto List::"+a);
		}
		return ProductosList;
	}

	@Override
	public Producto getProductoById(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Producto a = (Producto) session.load(Producto.class, id);
		logger.info("Producto loaded successfully, Producto details="+a);
		return a;
	}

	@Override
	public void removeProducto(String id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Producto a = (Producto) session.load(Producto.class, id);
		if(null != a){
			session.delete(a);
		}
		logger.info("Producto deleted successfully, Producto details="+a);
		
	}
	
	public String getNextId(){
		try{
			Session session = this.sessionFactory.getCurrentSession();
			org.hibernate.Transaction t = session.beginTransaction();
			String sequel = "Select max(idProducto) + 1 from Producto";
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
