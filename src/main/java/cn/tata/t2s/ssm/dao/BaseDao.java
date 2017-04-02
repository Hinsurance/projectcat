package cn.tata.t2s.ssm.dao;

import java.util.List;

import javax.persistence.Tuple;
import javax.persistence.criteria.Predicate;
import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;

import org.apache.commons.lang3.tuple.Pair;

import cn.tata.t2s.ssm.entity.Base;
import cn.tata.t2s.ssm.service.util.PagedResult;

public interface BaseDao<X extends Base, Y> {
	int insert(X entity);
	
	X update(X entity);
	
	int delete(Object primaryKey);
	
	X select(Object primaryKey);
	
	X select(Object primaryKey
			, Class<X> rootXype
			, Attribute<X, ?>... attribute);
	
	List<Tuple> select(Pair<SingularAttribute<X,Y>, Y> idPair, SetAttribute<X, ?>... setAttributes);
	
	<T> PagedResult<T> select(PagedResult<T> pagedResult
			, Pair<SingularAttribute<X,Y>, Y> idPair
			, SetAttribute<X, T> setAttribute
			, Predicate... customPredicate);
}
