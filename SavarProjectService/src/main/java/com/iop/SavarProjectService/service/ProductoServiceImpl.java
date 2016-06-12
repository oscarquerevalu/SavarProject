package com.iop.SavarProjectService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.iop.SavarProjectService.dao.ProductoDAO;
import com.iop.SavarProjectService.dto.Producto;
import com.iop.SavarProjectService.dto.Producto;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	private ProductoDAO ProductoDAO;
	

	public void setProductoDAO(ProductoDAO ProductoDAO) {
		this.ProductoDAO = ProductoDAO;
	}

	@Override
	@Transactional
	public void addProducto(Producto a) {
		// TODO Auto-generated method stub
		this.ProductoDAO.addProducto(a);
		
	}

	@Override
	@Transactional
	public void updateProducto(Producto a) {
		// TODO Auto-generated method stub
		this.ProductoDAO.updateProducto(a);
	}

	@Override
	@Transactional
	public List<Producto> listProductos() {
		// TODO Auto-generated method stub
		return this.ProductoDAO.listProductos();
	}

	@Override
	@Transactional
	public Producto getProductoById(String id) {
		// TODO Auto-generated method stub
		return this.ProductoDAO.getProductoById(id);
	}

	@Override
	@Transactional
	public void removeProducto(String id) {
		// TODO Auto-generated method stub
		this.ProductoDAO.removeProducto(id);
	}		
}
