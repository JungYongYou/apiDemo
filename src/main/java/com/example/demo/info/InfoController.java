package com.example.demo.info;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.info.model.Project;

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
}
