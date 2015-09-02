package com.jiveProj.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class EntryAction extends ActionSupport{
	private static final long serialVersionUID = 4207871414053427338L;
	private String os;
	private String version;
	private String notes;
	private String status;
	
	public String execute() {
		EntryService entryService = new EntryService();
		setStatus(entryService.printRecords(os, version, notes));

		return getStatus();
	}

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
