package com.rajbhavsar.springbootstarter.controller;

import com.rajbhavsar.springbootstarter.dto.TopicDTO;
import com.rajbhavsar.springbootstarter.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController
{
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<TopicDTO> getTopics()
	{
		return topicService.getTopics();
	}

	@GetMapping("/topics/{topicId}")
	public TopicDTO getTopicById(@PathVariable String topicId)
	{
		return topicService.getTopicById(topicId);
	}

	@PostMapping("/topics")
	public void addTopic(@RequestBody TopicDTO topic)
	{
		topicService.addTopic(topic);
	}

	@PutMapping("/topics/{topicId}")
	public void updateTopic(@PathVariable String topicId, @RequestBody TopicDTO topic)
	{
		topicService.updateTopic(topicId, topic);
	}

	@DeleteMapping("/topics/{topicId}")
	public void deleteTopic(@PathVariable String topicId)
	{
		topicService.deleteTopic(topicId);
	}
}
