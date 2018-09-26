package zhku.zhou.asset.service.login;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zhku.zhou.asset.dao.UserMapper;
import zhku.zhou.asset.entity.User;
import zhku.zhou.asset.entity.UserExample;
import zhku.zhou.asset.entity.UserExample.Criteria;

@Service
public class LoginService {
	@Autowired
	private UserMapper userMapper;
	public List<User> login(User user)
	{
		UserExample example = new UserExample();
		Criteria  criteria = example.createCriteria();
		criteria.andNameIsNotNull();
		criteria.andPwdIsNotNull();
		criteria.andNameEqualTo(user.getName());
		criteria.andPwdEqualTo(user.getPwd());
		return userMapper.selectByExample(example);
	}
	public int updateLoginTime(User user)
	{
		return userMapper.updateByPrimaryKeySelective(user);
	}
}
