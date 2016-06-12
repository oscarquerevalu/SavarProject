package com.iop.SavarProjectService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.iop.SavarProjectService.dao.ControlDAO;
import com.iop.SavarProjectService.dto.Control;

@Service
public class ControlServiceImpl implements ControlService{

	private ControlDAO ControlDAO;
	

	public void setControlDAO(ControlDAO ControlDAO) {
		this.ControlDAO = ControlDAO;
	}

	@Override
	@Transactional
	public void addControl(Control a) {
		// TODO Auto-generated method stub
		this.ControlDAO.addControl(a);
		
	}

	@Override
	@Transactional
	public void updateControl(Control a) {
		// TODO Auto-generated method stub
		this.ControlDAO.updateControl(a);
	}

	@Override
	@Transactional
	public List<Control> listControls() {
		// TODO Auto-generated method stub
		return this.ControlDAO.listControls();
	}

	@Override
	@Transactional
	public Control getControlById(String id) {
		// TODO Auto-generated method stub
		return this.ControlDAO.getControlById(id);
	}

	@Override
	@Transactional
	public void removeControl(String id) {
		// TODO Auto-generated method stub
		this.ControlDAO.removeControl(id);
	}	

}
