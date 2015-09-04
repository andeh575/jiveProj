/*	Purpose:	Utility function that loads the db.properties file and acquires a connection
 * 				to the Database
 */
package com.jiveProj.struts2.utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseUtility {
	private static Connection dbConnection = null;
	
	// Function that establishes connection to the database - properties found in db.properties
	public static Connection getConnection() {
		// Does a connection already exist?
		if(dbConnection != null)
			return dbConnection;
		// There wasn't an existing connection so let's create one
		else {
			try {
				// Prepare to load db.properties
				InputStream inputStream = DatabaseUtility.class.getClassLoader().getResourceAsStream("db.properties");
				Properties properties = new Properties();
				
				// Load db.properties, parse its contents, and create a new Connection
				if(properties != null) {
					properties.load(inputStream);
					
					String dbDriver = properties.getProperty("dbDriver");
					String connectionUrl = properties.getProperty("connectionUrl");
					String userName = properties.getProperty("userName");
					String password = properties.getProperty("password");
					
					Class.forName(dbDriver).newInstance();
					dbConnection = DriverManager.getConnection(connectionUrl, userName, password);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return dbConnection;
		}
	}
}
