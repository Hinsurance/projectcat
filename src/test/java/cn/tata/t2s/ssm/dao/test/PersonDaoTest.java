package cn.tata.t2s.ssm.dao.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import cn.tata.t2s.ssm.dao.PersonDao;
import cn.tata.t2s.ssm.entity.Person;
import cn.tata.t2s.ssm.entity.Person_;
import cn.tata.t2s.ssm.service.util.PagedResult;
import cn.tata.t2s.ssm.util.CriteriaQueryUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
@Transactional(transactionManager = "txManager")
@Rollback(false)
public class PersonDaoTest {
	@PersistenceContext
	private EntityManager em;
	@Autowired
	private PersonDao personDao;

	
	@Test
	public void selectpTypeById() {
		String pType = personDao.selectpTypeById("1");
		System.out.println(pType);
	}
	
	@Test
	public void selectProfileById() {
		Person person = personDao.selectPerson("1");
		System.out.println(person.getFollowList().size());
	}
	
	@Test
	public void selectPerson() {
		PagedResult<Person> personPagedList = personDao.select(
				new PagedResult<Person>(3, 1),
				ImmutablePair.of(Person_.personId, "1"), 
				Person_.followList);
		
		System.out.println(personPagedList.getData().size());
	}
	
	@Test
	public void insertFollow() {
		personDao.insertFollow("1", "2");
	}
	
	@Test
	public void removeFollow() {
		personDao.deleteFollow("1", "20170312");
	}
	
	@Test
	public void insertVistor() {
		System.out.println("--------------------");
		int result = personDao.insertPerson(new Person("20170316"));
		System.out.println(result);
		System.out.println("--------------------");
	}
	
	@Test
	public void saveProfile() {
	}

}
