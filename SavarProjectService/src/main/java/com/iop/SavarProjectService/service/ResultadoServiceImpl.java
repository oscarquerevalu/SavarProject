package com.iop.SavarProjectService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.iop.SavarProjectService.dao.ResultadoDAO;
import com.iop.SavarProjectService.dto.Resultado;
import com.iop.SavarProjectService.dto.Resultado;

@Service
public class ResultadoServiceImpl implements ResultadoService{
	
	private ResultadoDAO ResultadoDAO;
	

	public void setResultadoDAO(ResultadoDAO ResultadoDAO) {
		this.ResultadoDAO = ResultadoDAO;
	}

	@Override
	@Transactional
	public void addResultado(Resultado a) {
		// TODO Auto-generated method stub
		this.ResultadoDAO.addResultado(a);
		
	}

	@Override
	@Transactional
	public void updateResultado(Resultado a) {
		// TODO Auto-generated method stub
		this.ResultadoDAO.updateResultado(a);
	}

	@Override
	@Transactional
	public List<Resultado> listResultados() {
		// TODO Auto-generated method stub
		return this.ResultadoDAO.listResultados();
	}

	@Override
	@Transactional
	public Resultado getResultadoById(String id) {
		// TODO Auto-generated method stub
		return this.ResultadoDAO.getResultadoById(id);
	}

	@Override
	@Transactional
	public void removeResultado(String id) {
		// TODO Auto-generated method stub
		this.ResultadoDAO.removeResultado(id);
	}		
}
