package com.suhas.springboot.spring_boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suhas.springboot.spring_boot.dao.TopicRepository;
import com.suhas.springboot.spring_boot.models.Topic;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopicById(int id) {
		return topicRepository.findById(id).get();
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void deleteTopic(int id) {
		topicRepository.deleteById(id);
	}
}
