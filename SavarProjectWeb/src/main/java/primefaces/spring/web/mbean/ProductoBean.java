/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefaces.spring.web.mbean;

import com.iop.SavarProjectService.dto.Producto;
import com.iop.SavarProjectService.service.ProductoService;
import java.util.List;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author LAquino
 */
@Named(value = "productoBean")
@ViewScoped
public class ProductoBean {
    
    @Autowired(required = true)
    @Qualifier(value = "productoService")
    private ProductoService productoService;
    private List<Producto> lstProductos;
    private Producto producto = new Producto();
    
    public void addProducto() {
        productoService.addProducto(producto);
    }
    
    public void updateProducto() {
        productoService.updateProducto(producto);
    }
    
    public void listProductos() {
    	lstProductos = productoService.listProductos();
    }
    
    public Producto getProductoById(String id) {
        return productoService.getProductoById(id);
    }
    
    public void removeProducto() {
        productoService.removeProducto(producto.getProducto());
    }
    
    public ProductoService getProductoService() {
        return productoService;
    }
    
    public void setProductoService(ProductoService productoService) {
        this.productoService = productoService;
    }
    
    public Producto getProducto() {
        return producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

	public List<Producto> getLstProductos() {
		return lstProductos;
	}

	public void setLstProductos(List<Producto> lstProductos) {
		this.lstProductos = lstProductos;
	}
    
    
    
}
