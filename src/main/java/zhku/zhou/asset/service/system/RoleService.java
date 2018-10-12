package zhku.zhou.asset.service.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zhku.zhou.asset.dao.RoleMapper;
import zhku.zhou.asset.dao.UserMapper;
import zhku.zhou.asset.entity.Role;
import zhku.zhou.asset.entity.RoleExample;
import zhku.zhou.asset.entity.UserExample;
import zhku.zhou.asset.entity.UserExample.Criteria;

@Service
public class RoleService {
	@Autowired 
	private RoleMapper roleMapper;
	@Autowired 
	private UserMapper userMapper;
	public int updateOne(Role role) {
		return roleMapper.updateByPrimaryKeySelective(role);
	}

	public int addOne(Role role) {
		return roleMapper.insertSelective(role);
	}

	public int deleteOne(int id) {
		return roleMapper.deleteByPrimaryKey(id);
	}
	
	public Role selectOne(int id)
	{
		return roleMapper.selectByPrimaryKey(id);
	}

	public List<Role> getAll() 
	{
		RoleExample example = new RoleExample();
		return roleMapper.selectByExample(example);
	}
	
	public int  countForRole(int id) 
	{
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andRidEqualTo(id);
		return userMapper.countByExample(example);
	}
}
