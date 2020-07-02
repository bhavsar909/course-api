package com.rajbhavsar.springbootstarter.service;

import com.rajbhavsar.springbootstarter.dto.TopicDTO;
import com.rajbhavsar.springbootstarter.model.ITopic;
import com.rajbhavsar.springbootstarter.model.impl.Topic;
import com.rajbhavsar.springbootstarter.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService
{
	@Autowired
	private TopicRepository topicRepository;

	public List<TopicDTO> getTopics()
	{
		List<ITopic> topicList = new ArrayList<>();
		topicRepository.findAll().forEach(topicList::add);
		List<TopicDTO> topicDTOList = new ArrayList<>();
		topicList.forEach(topic ->
				topicDTOList.add(new TopicDTO(topic.getTopicId(), topic.getTopicName(), topic.getDescription())));
		return topicDTOList;
	}

	public TopicDTO getTopicById(String topicId)
	{
		ITopic topic = topicRepository.findById(topicId).orElse(null);
		if (topic != null)
			return new TopicDTO(topic.getTopicId(), topic.getTopicName(), topic.getDescription());
		else
			return null;
	}

	public void addTopic(TopicDTO topicDTO)
	{
		Topic topic = new Topic(topicDTO.getTopicId(), topicDTO.getTopicName(), topicDTO.getDescription());
		topicRepository.save(topic);
	}

	public void updateTopic(String topicId, TopicDTO topicDTO)
	{
		topicRepository.save(new Topic(topicDTO.getTopicId(), topicDTO.getTopicName(), topicDTO.getDescription()));
	}

	public void deleteTopic(String topicId)
	{
		topicRepository.deleteById(topicId);
	}
}