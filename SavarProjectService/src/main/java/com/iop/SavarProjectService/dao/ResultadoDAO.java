package com.iop.SavarProjectService.dao;

import java.util.List;

import com.iop.SavarProjectService.dto.Resultado;

public interface ResultadoDAO {
	
	public void addResultado(Resultado p);
	public void updateResultado(Resultado p);
	public List<Resultado> listResultados();
	public Resultado getResultadoById(String id);
	public void removeResultado(String id);	
	public String getNextId();
}
