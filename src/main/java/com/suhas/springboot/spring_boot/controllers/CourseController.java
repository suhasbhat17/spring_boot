package com.suhas.springboot.spring_boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suhas.springboot.spring_boot.models.Course;
import com.suhas.springboot.spring_boot.models.Topic;
import com.suhas.springboot.spring_boot.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourseById(@PathVariable int topicId, @PathVariable int id){
		return courseService.getById(topicId, id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable int topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}
	
	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getCoursesByTopic(@PathVariable int topicId){
		return courseService.getCoursesByTopic(topicId);
	}
}

