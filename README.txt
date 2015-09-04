Development Environment Entry System (DEES)
Author:	Andrew Graham
Date:	03 September 2015

Purpose:
The Development Environment Entry System (DEES) is a web application that allows a users to insert and list Development Environments in a database. DEES utilizes the struts2 framework and a mysql database. It has been tested and deployed with Apache Tomcat v8.0. 

A Development Environment consists of the following attributes:

	o OS - Required
	o OS Version - Required
	o Notes - Optional

Dependencies:
- Struts2:
	o commons-fileupload-2.1.jar
	o commons-io-2.2.jar
	o commons-lang3-3.2.jar
	o commons-logging-1.1.3.jar
	o commons-logging-api-1.1.jar
	o commons-validator-1.2.1.jar
	o freemarket-2.3.22.jar
	o javassist-3.11.0.GA.jar
	o ognl-3.0.6.jar
	o struts2-core-2.3.24.jar
	o xwork-core-2.3.24.jar
- Displaytag v1.2:
	o commons-beanutils-1.8.0.jar
	o commons-collections-3.1.jar
	o commons-lang-2.4.jar
	o displaytag-1.2.jar
- MYSQL:
	o mysql-connector-java-5.1.36-bin.jar

Installation/Configuration:
- Deploying the default jiveProj.WAR:
	o Put jiveProj.WAR into the the webapps directory of Tomcat
		- EX: H:\tomcat\webapps\jiveProj.WAR
	o Run buildJiveProjDB.sql to build the database
		- EX from MYSQL Command Line: SOURCE H:\buildJiveProjDB.sql
	o Start the Tomcat server
		- EX (From Terminal): H:\tomcat\bin\startup
	o Configure the database with db.properties
		- EX Location: H:\tomcat\webapps\jiveProj\WEB-INF\classes\db.properties
	o The default url of DEES:
		- localhost:8080/jiveProj/
- Customizing DEES:
	o Extract the project source code from jiveProj.zip
	o Configure the database connection with src/db.properties:
		- dbDriver:		Database driver class (Default: com.mysql.jdbc.Driver)
		- connectionUrl:	Database url (Default: jdbc:mysql://localhost:3306/jiveProj)
		- userName:		Database username (Default: root)
		- password:		Database password (Default: root123)
	o Run buildJiveProjDB.sql to build the database
	o Export the project to a WAR file 
		- EX (Using Eclipse): In the project explorer, right-click on jiveProj->Export->WAR File, deploy exported WAR to server

