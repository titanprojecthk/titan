package com.titan.server.core.mapper;

import java.util.ArrayList;
import java.util.List;

import com.titan.server.core.domain.User;
import com.titan.server.web.model.UserVo;

public class UserMapper extends BaseMapper {
	
	public static UserVo map(User user) {
		if (user == null) {
			return null;
		}
		
		UserVo userVo = new UserVo();
		BaseMapper.map(user, userVo);
		
		return userVo;
	}
	
	public static List<UserVo> map(List<User> users) {
		if (users == null) {
			return null;
		}
		
		List<UserVo> UserVos = new ArrayList<UserVo>();
		for (User user : users) {
			UserVos.add(UserMapper.map(user));
		}
		
		return UserVos;
	}

}
