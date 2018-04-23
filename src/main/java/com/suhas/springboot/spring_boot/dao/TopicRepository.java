package com.suhas.springboot.spring_boot.dao;

import org.springframework.data.repository.CrudRepository;

import com.suhas.springboot.spring_boot.models.Topic;

public interface TopicRepository extends CrudRepository<Topic, Integer>{
}
