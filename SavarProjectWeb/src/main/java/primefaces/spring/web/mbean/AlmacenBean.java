/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefaces.spring.web.mbean;

import com.iop.SavarProjectService.dto.Almacen;
import com.iop.SavarProjectService.service.AlmacenService;
import java.util.List;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author LAquino
 */
@Named(value = "almacenBean")
@ViewScoped
public class AlmacenBean {

    @Autowired(required = true)
    @Qualifier(value = "almacenService")
    private AlmacenService almacenService;
    private Almacen almacen;

    public void addAlmacen() {
        almacenService.addAlmacen(almacen);
    }

    public void updateAlmacen() {
        almacenService.updateAlmacen(almacen);
    }

    public List<Almacen> listAlmacens() {
        return almacenService.listAlmacens();
    }

    public Almacen getAlmacenById() {
        return almacenService.getAlmacenById(almacen.getIdAlmacen());
    }

    public void removeAlmacen() {
        almacenService.removeAlmacen(almacen.getIdAlmacen());
    }

    public AlmacenService getAlmacenService() {
        return almacenService;
    }

    public void setAlmacenService(AlmacenService almacenService) {
        this.almacenService = almacenService;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

}
