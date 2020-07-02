package com.rajbhavsar.springbootstarter.model.impl;

import com.rajbhavsar.springbootstarter.model.ITopic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic implements ITopic
{
	@Id
	private String topicId;
	private String topicName;
	private String description;

	public Topic()
	{
	}

	public Topic(final String topicId, final String topicName, final String description)
	{
		this.topicId = topicId;
		this.topicName = topicName;
		this.description = description;
	}

	public String getTopicId()
	{
		return topicId;
	}

	public void setTopicId(final String topicId)
	{
		this.topicId = topicId;
	}

	public String getTopicName()
	{
		return topicName;
	}

	public void setTopicName(final String topicName)
	{
		this.topicName = topicName;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(final String description)
	{
		this.description = description;
	}
}
