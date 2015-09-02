package com.jiveProj.struts2.action;

// We'll use this class for interacting with the DB
public class EntryService {
	
	public String printRecords(String os, String version, String notes) {
		System.out.println(os);
		System.out.println(version);
		System.out.println(notes);
		// Placeholder
		return "success";
	}
}
