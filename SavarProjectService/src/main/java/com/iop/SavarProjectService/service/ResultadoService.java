package com.iop.SavarProjectService.service;

import java.util.List;

import com.iop.SavarProjectService.dto.Resultado;

public interface ResultadoService {
	
	public void addResultado(Resultado p);
	public void updateResultado(Resultado p);
	public List<Resultado> listResultados();
	public Resultado getResultadoById(String id);
	public void removeResultado(String id);	
}
