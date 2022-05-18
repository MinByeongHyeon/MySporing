package com.sporing.app.intro.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.sporing.app.mybatis.config.MyBatisConfig;

public class IntroDAO {
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlSessionFactory();
	SqlSession sqlSession;
	
	public IntroDAO() {
		sqlSession = sqlSessionFactory.openSession(true);
	}

}
