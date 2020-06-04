package com.great.demo.mapper;

import com.great.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper
//	user对象接口，包含可调用的多个方法
{
	public User login(User user);

}
