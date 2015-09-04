/*  Purpose:	Model class for Development Environments entries
 * 				An entry in the database consists of Strings:
 * 				
 * 				OS (Required) | Version (Required) | Notes (Optional)  
 */
package com.jiveProj.struts2.model;

public class DevEnvironment {
	private String os;
	private String version;
	private String notes;
	
	public DevEnvironment(String os, String version, String notes) {
		this.os = os;
		this.version = version;
		this.notes = notes;
	}
	
	// Default getters/setters for model class OpSystem
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
