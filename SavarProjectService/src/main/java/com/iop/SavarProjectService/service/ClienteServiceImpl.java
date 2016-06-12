package com.iop.SavarProjectService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.iop.SavarProjectService.dao.ClienteDAO;
import com.iop.SavarProjectService.dto.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{

	private ClienteDAO ClienteDAO;
	

	public void setClienteDAO(ClienteDAO ClienteDAO) {
		this.ClienteDAO = ClienteDAO;
	}

	@Override
	@Transactional
	public void addCliente(Cliente a) {
		// TODO Auto-generated method stub
		this.ClienteDAO.addCliente(a);
		
	}

	@Override
	@Transactional
	public void updateCliente(Cliente a) {
		// TODO Auto-generated method stub
		this.ClienteDAO.updateCliente(a);
	}

	@Override
	@Transactional
	public List<Cliente> listClientes() {
		// TODO Auto-generated method stub
		return this.ClienteDAO.listClientes();
	}

	@Override
	@Transactional
	public Cliente getClienteById(String id) {
		// TODO Auto-generated method stub
		return this.ClienteDAO.getClienteById(id);
	}

	@Override
	@Transactional
	public void removeCliente(String id) {
		// TODO Auto-generated method stub
		this.ClienteDAO.removeCliente(id);
	}	

	
}
