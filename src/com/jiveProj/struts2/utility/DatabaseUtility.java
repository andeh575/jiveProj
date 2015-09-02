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
	
	public static Connection getConnection() {
		if(dbConnection != null)
			return dbConnection;
		else {
			try {
				InputStream inputStream = DatabaseUtility.class.getClassLoader().getResourceAsStream("db.properties");
				Properties properties = new Properties();
				
				// If the db.properties file exists in src then create a new Connection with the settings
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
