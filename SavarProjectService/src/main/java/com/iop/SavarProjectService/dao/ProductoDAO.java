package com.iop.SavarProjectService.dao;

import java.util.List;

import com.iop.SavarProjectService.dto.Producto;

public interface ProductoDAO {
	
	public void addProducto(Producto p);
	public void updateProducto(Producto p);
	public List<Producto> listProductos();
	public Producto getProductoById(String id);
	public void removeProducto(String id);
	public String getNextId();
}
