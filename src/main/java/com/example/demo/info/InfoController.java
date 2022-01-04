package com.example.demo.info;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.info.model.Project;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@RestController
public class InfoController {

	@GetMapping("/info")
	public Object projectInfo() {
		Project project = new Project();
		project.projectName = "apiDemo";
		project.author = "jydev";
		project.createdDate = new Date();
		return project;
	}
	
	@GetMapping("/info2")
	public String customJson() {
		JsonObject jo = new JsonObject();
		
		jo.addProperty("projectName", "apiDemo");
		jo.addProperty("author", "jydev");
		jo.addProperty("createdDate", new Date().toString());
		
		JsonArray ja = new JsonArray();
		for(int i=0; i<5; i++) {
			JsonObject jObj = new JsonObject();
			jObj.addProperty("prop"+i, i);
			ja.add(jObj);
		}
		
		jo.add("follower", ja);
		
		return jo.toString();
	}
}
