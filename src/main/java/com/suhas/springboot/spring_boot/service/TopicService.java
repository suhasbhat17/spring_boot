package com.suhas.springboot.spring_boot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.suhas.springboot.spring_boot.models.Topic;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(0, "Java", "Java Courses"),
			new Topic(1, "Web", "Web Courses"), new Topic(2, "Javascript", "Javascript Courses")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopicById(int id) {
		return topics.stream().filter((t) -> t.getId() == id).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.forEach(t -> {
			if (t.getId() == topic.getId()) {
				throw new IllegalArgumentException("Topic already exists");
			}
		});
		topics.add(topic);	
	}
	
	public void updateTopic(int id, Topic topic) {
		if(topics.get(id) != null) {
			topics.set(id, topic);
		}
	}
	
	public void deleteTopic(int id) {
		if(topics.get(id) != null) {
			topics.remove(id);
		}
	}
}
