package cn.tata.t2s.ssm.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.tata.t2s.ssm.dao.TopicDao;
import cn.tata.t2s.ssm.entity.Topic;

@Repository
@Transactional
public class TopicDaoImpl implements TopicDao {

	@Override
	public Topic selectTopicById(int topicId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Topic> selectAllTopic(String className, int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Topic> dynamicSelectTopic(String className, String[] school, String[] academy, String fluzzyName,
			int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Topic> selectTopicByPersonId(String personId, int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectTopicCountToday(String personId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertTopic(Topic topic) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertTopicStateById(int topicId, int topicStateTypeId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateToicById(Topic topic) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteTopicStateById(int topicId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteTopicById(int topicId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTopicStateById(int topicId, int topicStateTypeId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setOnDelete(int topicId) {
		// TODO Auto-generated method stub
		return 0;
	}

}