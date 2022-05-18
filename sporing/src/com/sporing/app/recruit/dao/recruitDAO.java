package com.sporing.app.recruit.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.sporing.app.mybatis.config.MyBatisConfig;

public class recruitDAO {
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlSessionFactory();
	SqlSession sqlSession;
	
	public recruitDAO() {
		sqlSession = sqlSessionFactory.openSession(true);
	}

}
