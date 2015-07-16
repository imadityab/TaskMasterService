package com.taskmaster.service;


import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONArray;
import org.json.JSONObject;

@Path("/taskservice")
public class TaskService {
	@GET
	@Produces("application/json")
	public Response getDummyTasks() {
		
		JSONObject result = new JSONObject();
		
		JSONObject chapati = new JSONObject();
		chapati.put("taskID", "T1");
		chapati.put("summary", "Make Chapatis");
		chapati.put("from", "Ambre");
		
		JSONObject cleaning = new JSONObject();
		cleaning.put("taskID", "T2");
		cleaning.put("summary", "Clean Kitchen");
		cleaning.put("from", "Ketan");

		JSONObject cooking = new JSONObject();
		cooking.put("taskID", "T3");
		cooking.put("summary", "Cook sabji");
		cooking.put("from", "Zeeshan");
		
		JSONArray taskArray = new JSONArray();
	
		taskArray.put(chapati);
		taskArray.put(cleaning);
		taskArray.put(cooking);
			
		result.put("tasks", taskArray);
		
		//String result = "@Produces(\"application/json\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return Response.status(200).entity(result.toString()).build();
	}
 
}