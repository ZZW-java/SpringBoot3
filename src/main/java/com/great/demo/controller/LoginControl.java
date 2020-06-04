package com.great.demo.controller;

import com.great.demo.bean.User;
import com.great.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     //定义当前类为控制类
public class LoginControl
{
	@Autowired                    //通过这个注解可直接调用其他类
	private LoginService loginService;


	@RequestMapping("index")
	public Object index()
	{
		User user = new User();
		user.setUserNum(101);
		user.setUserPass("e10adc3949ba59abbe56e057f20f883e");
		try
		{
			user = loginService.userLogin(user);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return user;
	}


}
