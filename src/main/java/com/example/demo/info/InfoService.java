package com.example.demo.info;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.info.model.City;
import com.example.demo.info.model.Project;
import com.example.demo.info.repository.CityRepository;

@Service
public class InfoService {
	
	private final CityRepository cityRepository;
	
	// spring 4.2 이상은 @Autowired 생략 가능
	public InfoService(CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}
	
	public List<City> getCityList() {
		return this.cityRepository.findList();
	}
	
	public Project getProjectInfo() {	
		Project project = new Project();
		project.projectName = "apiDemo";
		project.author = "jydev";
		project.createdDate = new Date();
		return project;
	}
}