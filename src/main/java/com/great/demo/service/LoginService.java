package com.great.demo.service;

import com.great.demo.bean.User;
import java.io.IOException;

public interface LoginService
	//登陆相关功能service逻辑处理父类
{
	public User userLogin(User user) throws IOException;

}
