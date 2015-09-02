package com.jiveProj.struts2.action;

import java.util.ArrayList;
import java.util.List;
import com.jiveProj.struts2.model.DevEnvironment;
import com.jiveProj.struts2.service.DevEnvService;
import com.opensymphony.xwork2.ActionSupport;

public class TableAction extends ActionSupport {
	private static final long serialVersionUID = 4954302457191861694L;
	private List<DevEnvironment> devEnvironments = new ArrayList<DevEnvironment>();

	
	public String displayDevEnvList() {
		DevEnvService devEnvService = new DevEnvService();
		
		// Get the list of development environments from the database
		setDevEnvironments(devEnvService.devEnvList());

		return SUCCESS;
	}

	// Default getters/setters
	public List<DevEnvironment> getDevEnvironments() {
		return devEnvironments;
	}

	public void setDevEnvironments(List<DevEnvironment> devEnvironments) {
		this.devEnvironments = devEnvironments;
	}

}
