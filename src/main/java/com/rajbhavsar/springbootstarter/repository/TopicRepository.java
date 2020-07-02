package com.rajbhavsar.springbootstarter.repository;

import com.rajbhavsar.springbootstarter.model.impl.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>
{
}
