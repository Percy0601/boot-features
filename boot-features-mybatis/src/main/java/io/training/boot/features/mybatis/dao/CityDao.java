package io.training.boot.features.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import io.training.boot.features.mybatis.domain.City;

//@Repository
public class CityDao {
	@Autowired
	private SqlSession sqlSession;

	public City selectCityById(long id) {
		return this.sqlSession.selectOne("selectCityById", id);
	}
}
