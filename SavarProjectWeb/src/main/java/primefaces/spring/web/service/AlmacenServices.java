/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefaces.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.iop.SavarProjectService.dto.Almacen;
import com.iop.SavarProjectService.service.AlmacenService;

/**
 *
 * @author LAquino
 */
@Service
public class AlmacenServices {

    @Autowired(required = true)
    @Qualifier(value = "almacenService")
    private AlmacenService almacenService;

    public List<Almacen> listAlmacens() {
    	
        return almacenService.listAlmacens();
    }

}
