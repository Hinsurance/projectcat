package cn.tata.t2s.ssm.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.tata.t2s.ssm.dao.ReplyDao;
import cn.tata.t2s.ssm.entity.Reply;

@Repository
@Transactional
public class ReplyDaoImpl implements ReplyDao {

	@Override
	public List<Reply> selectReplyByTopicId(int tocpicId, int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reply> selectReplyByPersonId(String personId, int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertReply(Reply reply) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateReplyById(Reply reply) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteReplyById(long replyId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setOnDelete(long replyId) {
		// TODO Auto-generated method stub
		return 0;
	}

}