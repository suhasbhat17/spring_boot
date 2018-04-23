package com.suhas.springboot.spring_boot.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.suhas.springboot.spring_boot.models.Course;

public interface CourseRepository extends CrudRepository<Course, Integer>{
	
	public List<Course> findByTopicId(int id);

}
