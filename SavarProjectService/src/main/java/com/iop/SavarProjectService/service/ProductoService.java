package com.iop.SavarProjectService.service;

import java.util.List;

import com.iop.SavarProjectService.dto.Producto;

public interface ProductoService {
	
	public void addProducto(Producto p);
	public void updateProducto(Producto p);
	public List<Producto> listProductos();
	public Producto getProductoById(String id);
	public void removeProducto(String id);	
}
