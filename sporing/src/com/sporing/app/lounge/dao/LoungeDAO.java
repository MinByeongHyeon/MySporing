package com.sporing.app.lounge.dao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.sporing.app.mybatis.config.MyBatisConfig;



public class LoungeDAO {
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlSessionFactory();
	SqlSession sqlSession;
	
	public LoungeDAO() {
		sqlSession = sqlSessionFactory.openSession(true);
	}

}
