/*	Purpose:	Services as a median between the Controller and Repository classes
 */
package com.jiveProj.struts2.service;

import com.jiveProj.struts2.repository.DevEnvRepository;

public class DevEnvService {
	private DevEnvRepository devEnvRepository;
	
	public DevEnvService() {
		devEnvRepository = new DevEnvRepository();
	}
	
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
}
