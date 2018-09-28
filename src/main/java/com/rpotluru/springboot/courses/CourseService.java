package com.rpotluru.springboot.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getCourses() {
		 List<Course> courses = new ArrayList<>();
		 courseRepository.findAll().forEach(courses::add);
		 return courses;
	}

	public Course getCourse(String id) {
		return courseRepository.findById(id).orElse(null);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}


	public void updateCourse(Course course, String id) {
		courseRepository.save(course);
	}

	public void deleteourse(String id) {
		courseRepository.deleteById(id);;
		
	}
	


}
