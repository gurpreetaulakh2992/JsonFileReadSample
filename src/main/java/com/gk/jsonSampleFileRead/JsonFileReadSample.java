package com.gk.jsonSampleFileRead;

/**
 * @author Gurpreet Kaur
 * @created on 15-June-2021
 * Maven Project that reads data from JSON file and display output in console
 */
//import files 
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//Assignment 2 is the class name
public class JsonFileReadSample {
	// Main method
	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser jsonparser = new JSONParser();// creating object of JSONParser method
		FileReader reader = new FileReader(".\\jsonfiles\\student.json");// reference path of json file and read using filereader
																			
		Object obj = jsonparser.parse(reader);// java object
		JSONObject studentJsonObj = (JSONObject) obj;// create studentjsonobj object
		/**
		 * @params first_name,last_name,address_student,grades,contact_info are
		 *         parameters get method used to fetch/extract the values of given keys
		 */
		JSONArray first_name = (JSONArray) studentJsonObj.get("firstName");
		JSONArray last_name = (JSONArray) studentJsonObj.get("lastName");
		JSONArray address_student = (JSONArray) studentJsonObj.get("address");
		JSONArray grades = (JSONArray) studentJsonObj.get("grades");
		JSONArray contact_info = (JSONArray) studentJsonObj.get("contact");
		int i, j;// outer and inner loop counter
        
		//for reading array of json objects
		for (i = 0; i < first_name.size(); i++) {
			for (j = i; j <= i; j++) {
				JSONObject address = (JSONObject) address_student.get(j);
				String Street = (String) address.get("street");
				String City = (String) address.get("city");
				String State = (String) address.get("state");
				// To print results
				System.out.println("FirstName:" + first_name.get(i));
				System.out.println("LastName:" + last_name.get(i));
				System.out.println("Address:");
				System.out.println("\t Street:" + Street);
				System.out.println("\t City:" + City);
				System.out.println("\t State:" + State);
				System.out.println("Grades:" + grades.get(i));
				System.out.println("Phone Number:" + contact_info.get(i));
				System.out.println("-------------------------------------");

			}
		}

	}
}
