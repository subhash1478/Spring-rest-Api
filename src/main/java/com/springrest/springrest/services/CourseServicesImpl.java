package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServicesImpl implements CourseService {
    @Autowired
	private CourseDao courseDao;
	
	public CourseServicesImpl() {
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}
	
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
		
		
	}

}
