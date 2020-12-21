package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServicesImpl implements CourseService {

	List<Course> list;
	
	public CourseServicesImpl() {
		list = new ArrayList<>();
		list.add(new Course(123,"tdyf","fyf"));
		list.add(new Course(123,"tdyf","fyf"));
		list.add(new Course(123,"tdyf","fyf"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

}
