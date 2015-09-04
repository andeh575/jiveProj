/*	Purpose:	Services as a median between the Controller and Repository classes
 */
package com.jiveProj.struts2.service;

import java.util.ArrayList;
import java.util.List;

import com.jiveProj.struts2.model.DevEnvironment;
import com.jiveProj.struts2.repository.DevEnvRepository;

public class DevEnvService {
	private DevEnvRepository devEnvRepository;
	
	// Constructor - create an new instance connecting to the database
	public DevEnvService() {
		devEnvRepository = new DevEnvRepository();
	}
	
	// Function that saves records into the database via devEnvRepository
	public String save(String os, String version, String notes) {
		// Make sure the repository exists
		if(devEnvRepository != null) {
			// Make sure this isn't a duplicate entry
			if(devEnvRepository.findDuplicate(os, version)) {
				return "EntryFailure-EntryExists";
			}
			
			// Save the entry to the database
			devEnvRepository.save(os, version, notes);
			return "EntrySuccess";
		} else {
			// Something went wrong with the Database
			return "EntryFailure";
		}
	}

	// Construct a list of OSs from the database
	public List<DevEnvironment> devEnvList() {
		List<DevEnvironment> devEnvironments = new ArrayList<DevEnvironment>();
		
		// Check to ensure a connection to the database exists
		if(devEnvRepository != null) {
			// Get the list of entries from the database 
			devEnvironments = devEnvRepository.devEnvList();
		}
		
		return devEnvironments;
	}
}
