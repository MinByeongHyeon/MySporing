package com.sporing.app.team.dao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.sporing.app.mybatis.config.MyBatisConfig;

public class TeamDAO {
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlSessionFactory();
	SqlSession sqlSession;
	
	public TeamDAO() {
		sqlSession = sqlSessionFactory.openSession(true);
	}
}
