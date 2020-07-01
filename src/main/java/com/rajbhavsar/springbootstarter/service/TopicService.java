package com.rajbhavsar.springbootstarter.service;

import com.rajbhavsar.springbootstarter.dto.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService
{
	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic("spring", "Spring", "In this we will cover all basic Spring fundamentals"),
					new Topic("java", "Java", "In this we will cover all basic Java fundamentals"),
					new Topic("dbms", "Dbms", "In this we will cover all basic dbms fundamentals")
			)
	);

	public List<Topic> getTopics()
	{
		return topics;
	}

	public Topic getTopicById(String topicId)
	{
		return topics.stream().filter(topic -> topic.getTopicId().equals(topicId)).findFirst().get();
	}

	public Boolean addTopic(Topic topic){
		return topics.add(topic);
	}

	public void updateTopic(String topicId, Topic topic){
		for (int i = 0; i < topics.size(); i++)
		{
			if (topics.get(i).getTopicId().equals(topicId)){
				topics.set(i,topic);
			}
		}
	}

	public Boolean deleteTopic(String topicId){
		return topics.removeIf(topic -> topic.getTopicId().equals(topicId));
	}
}
