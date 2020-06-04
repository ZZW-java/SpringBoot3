package com.great.demo.service.impl;

import com.great.demo.bean.User;
import com.great.demo.mapper.UserMapper;
import com.great.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")    //通过这个注解可在控制类直接调用当前service
public class LoginServiceImpl implements LoginService
		//登陆相关功能service逻辑处理实现类
{


	@Autowired             //通过这个注解可直接调用已经加载在中央控制器的映射文件
	private UserMapper userMapper;


	@Override
	public User userLogin(User user)
	{

		User nowuser =null;
		try
		{

			nowuser = userMapper.login(user);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return nowuser;
	}


}
