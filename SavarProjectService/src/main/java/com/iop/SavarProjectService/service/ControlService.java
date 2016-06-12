package com.iop.SavarProjectService.service;

import java.util.List;

import com.iop.SavarProjectService.dto.Control;

public interface ControlService {
	
	public void addControl(Control c);
	public void updateControl(Control c);
	public List<Control> listControls();
	public Control getControlById(String id);
	public void removeControl(String id);	
	public String getNextId();
}
