/*	Purpose:	Supports database operations
 * 				- Saves DevEnvironment data into associated table
 * 				- Checks for duplicate entries
 */
package com.jiveProj.struts2.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jiveProj.struts2.utility.DatabaseUtility;

public class DevEnvRepository {
	private Connection dbConnection;
	
	public DevEnvRepository() {
		dbConnection = DatabaseUtility.getConnection();
	}
	
	// Function to save the entry in the database
	public void save(String os, String version, String notes) {
		if(dbConnection != null) {
			try {
				PreparedStatement ps = dbConnection.prepareStatement("INSERT INTO dev_env(os, version, notes) values(?, ?, ?)");
				
				ps.setString(1, os);
				ps.setString(2, version);
				ps.setString(3, notes);
				
				ps.executeUpdate();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// Function to find duplicate entry of OS/Version in the table
	public boolean findDuplicate(String os, String version) {
		if(dbConnection != null) {
			try{
				PreparedStatement ps = dbConnection.prepareStatement("SELECT version FROM dev_env WHERE os ?");
				ps.setString(1, os);
				
				ResultSet result = ps.executeQuery();
				
				if(result != null) {
					while(result.next()) {
						if(result.getString(1).equals(version)) {
							return true;
						}
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}
}
