/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefaces.spring.web.mbean;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.iop.SavarProjectService.dto.Almacen;
import com.iop.SavarProjectService.service.AlmacenService;

import primefaces.spring.web.service.AlmacenServices;

/**
 *
 * @author LAquino
 */
@ManagedBean(value = "almacenBean")
@ViewScoped
public class AlmacenBean {

	@Autowired
    private AlmacenServices almacenServices;
    private List<Almacen> listaAlmacens;
    private Almacen almacen = new Almacen();
    

    @PostConstruct
    public void init() {
    	
//    	almacen= new Almacen();
//    	listaAlmacens = almacenService.listAlmacens();
    }

    public void addAlmacen() {
//        almacenServices.addAlmacen(almacen);
    }

    public void updateAlmacen() {
//        almacenServices.updateAlmacen(almacen);
    }

    public void listAlmacens() {
    	
    	System.out.println("Listando almacenes");
        listaAlmacens = almacenServices.listAlmacens();
        System.out.println("fin lista almacenes");
    }

    public Almacen getAlmacenById() {
//        return almacenService.getAlmacenById(almacen.getAlmacen());
    	return null;
    }

    public void removeAlmacen() {
//        almacenService.removeAlmacen(almacen.getAlmacen());
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

	public List<Almacen> getListaAlmacens() {
		return listaAlmacens;
	}

	public void setListaAlmacens(List<Almacen> listaAlmacens) {
		this.listaAlmacens = listaAlmacens;
	}

}
