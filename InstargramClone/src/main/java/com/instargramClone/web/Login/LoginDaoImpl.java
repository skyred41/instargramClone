package com.instargramClone.web.Login;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {

	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.instargramClone.mapper.LoginMapper";
	
	@Override
	public void insertUserInfo(LoginVO loginVO) {
		session.insert(namespace+".insertUserInfo");
	}
}
