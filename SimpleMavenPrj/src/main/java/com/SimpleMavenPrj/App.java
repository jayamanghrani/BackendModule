package com.SimpleMavenPrj;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;  
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JSONException
    {
    	System.out.println("Maven prj"); 
    	
    	String JSONstring = "{\"Status\": \"success\", \"StatusCode\": \"0000\",\"PolicyNumber\": \"60006735\",\"ApplicationNumber\": \"M00096822\"}";
   
    	JSONObject responseJSON = new JSONObject(JSONstring);
    	    	
    	if(responseJSON.getString("StatusCode").equals("0000")) 
		{
    	 System.out.println("Policy number----"+responseJSON.getString("PolicyNumber"));
		}
    
    
    }
}


	
//  This is simple maven project,run it as java application or by creating Runnable jar " );

	
	// Maven build command
/*    mvn clean  - It will delete target folder 
	
  	  mvn install -primary jobs are to 1)Download The Dependencies and 2)Build The Project
  					mvn install will invoke mvn validate, mvn compile, mvn test, mvn package etc.
  
      if we have first run - mvn clean command , then next time don't use mvn clean install ,it will give error 
      use mvn install beacuse it already cleaned that target folder 
      
	
	 After doing any changes -- Run as--Maven install)*/
	
 //Logs of Maven install







/* We can run it  by 2 ways
 * 
 * 1. run as -- java application
 * 
 * 2. create jar -- run jar by cmd  (Error: Could not find or load main class com.SimpleMavenPrj )
 * 
 * 
 * 3. create runnable jar --- o/p (This is my simple java program)
 * 
 * */
