/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefaces.spring.web.mbean;

import com.iop.SavarProjectService.dto.Sucursal;
import com.iop.SavarProjectService.service.SucursalService;
import java.util.List;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author LAquino
 */
@Named(value = "sucursalBean")
@ViewScoped
public class SucursalBean {

    @Autowired(required = true)
    @Qualifier(value = "sucursalService")
    private SucursalService sucursalService;
    private Sucursal sucursal;

    public void addSucursal() {
        sucursalService.addSucursal(sucursal);
    }

    public void updateSucursal() {
        sucursalService.updateSucursal(sucursal);
    }

    public List<Sucursal> listSucursals() {
        return sucursalService.listSucursals();
    }

    public Sucursal getSucursalById(String id) {
        return sucursalService.getSucursalById(id);
    }

    public void removeSucursal() {
        sucursalService.removeSucursal(sucursal.getSucursal());
    }

    public SucursalService getSucursalService() {
        return sucursalService;
    }

    public void setSucursalService(SucursalService sucursalService) {
        this.sucursalService = sucursalService;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

}
