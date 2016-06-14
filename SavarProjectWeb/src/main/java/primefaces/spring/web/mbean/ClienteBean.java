/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefaces.spring.web.mbean;

import com.iop.SavarProjectService.dto.Cliente;
import com.iop.SavarProjectService.service.ClienteService;
import java.util.List;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author LAquino
 */
@Named(value = "clienteBean")
@ViewScoped
public class ClienteBean {

    @Autowired(required = true)
    @Qualifier(value = "clienteService")
    private ClienteService clienteService;
    private Cliente cliente;

    public ClienteService getClienteService() {
        return clienteService;
    }

    public void setClienteService(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean() {
    }

    public void addCliente() {
        clienteService.addCliente(getCliente());
    }

    public void updateCliente() {
        clienteService.updateCliente(getCliente());
    }

    public List<Cliente> listClientes() {
        return clienteService.listClientes();
    }

    public Cliente getClienteById(String id) {
        return clienteService.getClienteById(id);
    }

    public void removeCliente() {
        clienteService.removeCliente(cliente.getIdCliente());
    }
}
