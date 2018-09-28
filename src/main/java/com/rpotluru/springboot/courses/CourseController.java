package com.rpotluru.springboot.courses;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
    private CourseService courseService;

	@RequestMapping("/")
    public String index() {
        return "Greetings from Learning App!";
    }
	@RequestMapping("courses")
	public List<Course> getCourses() {
		return courseService.getCourses();
		
	}
	
	@RequestMapping("courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
		
	}
	@RequestMapping(method=RequestMethod.POST, value="/courses")
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String id) {
		courseService.updateCourse(course, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/courses/{id}")
	public void deleteourse(@PathVariable String id) {
		courseService.deleteourse(id);
	}
}
