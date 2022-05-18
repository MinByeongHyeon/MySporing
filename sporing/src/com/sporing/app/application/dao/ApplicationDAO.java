package com.sporing.app.application.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.sporing.app.mybatis.config.MyBatisConfig;



public class ApplicationDAO {
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlSessionFactory();
	SqlSession sqlSession;
	
	public ApplicationDAO() {
		sqlSession = sqlSessionFactory.openSession(true);
	}

}
