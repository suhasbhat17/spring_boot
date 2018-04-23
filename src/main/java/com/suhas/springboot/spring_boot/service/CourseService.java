package com.suhas.springboot.spring_boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suhas.springboot.spring_boot.dao.CourseRepository;
import com.suhas.springboot.spring_boot.models.Course;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public Course getById(int topicId, int id){
		return courseRepository.findById(id).get();
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	public List<Course> getCoursesByTopic(int id){
		return courseRepository.findByTopicId(id);
	}
}
