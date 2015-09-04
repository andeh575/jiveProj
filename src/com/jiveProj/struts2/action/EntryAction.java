/*	Purpose:	Action that allows the user to submit data entries into the database
 * 
 */
package com.jiveProj.struts2.action;

import com.jiveProj.struts2.service.DevEnvService;
import com.opensymphony.xwork2.ActionSupport;

public class EntryAction extends ActionSupport{
	private static final long serialVersionUID = 4207871414053427338L;
	private String os;
	private String version;
	private String notes;
	
	public String execute() throws Exception {
		String result = "";									// Control string
		DevEnvService devEnvService = new DevEnvService();	// Begin database connection service
		
		// Attempt to save the entry into the database
		result = devEnvService.save(os, version, notes);
		
		// Did the entry get properly saved to the Database?
		if(result.equals("EntrySuccess")) {
			return SUCCESS;
		} else if(result.equals("EntryFailure-EntryExists")) {
			return "duplicate";
		} else {
			return ERROR;
		}
	}

	// Default getters/setters
	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
