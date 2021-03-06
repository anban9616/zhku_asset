package zhku.zhou.asset.service.system;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zhku.zhou.asset.dao.OrganizationMapper;
import zhku.zhou.asset.dao.RoleMapper;
import zhku.zhou.asset.dao.UserMapper;
import zhku.zhou.asset.dao.UserPageMapper;
import zhku.zhou.asset.entity.Organization;
import zhku.zhou.asset.entity.OrganizationExample;
import zhku.zhou.asset.entity.Role;
import zhku.zhou.asset.entity.RoleExample;
import zhku.zhou.asset.entity.User;
import zhku.zhou.asset.entity.UserPage;
import zhku.zhou.asset.entity.UserPageExample;
import zhku.zhou.asset.entity.UserPageExample.Criteria;


@Service
public class UserService {
	@Autowired
	private UserPageMapper userPageMapper;
	@Autowired
	private OrganizationMapper organizationMapper;
	@Autowired
	private RoleMapper roleMapper;
	@Autowired
	private UserMapper userMapper;
	public List<UserPage> getAll()
	{
		UserPageExample example = new UserPageExample();
		List<UserPage> list = userPageMapper.selectByExample(example);
		return list;
	}
	public List<Organization> getOrganizationList() {
		OrganizationExample organizationExample = new OrganizationExample();
		List<Organization> list = organizationMapper.selectByExample(organizationExample);
		return list;
	}
	public List<Role> getRoleList() {
		RoleExample roleExample = new RoleExample();
		List<Role> list = roleMapper.selectByExample(roleExample);
		return list;
	}
	public int addOne(User user) {
		return userMapper.insertSelective(user);
	}
	public UserPage SelectOne(Integer id) {
		UserPageExample example = new UserPageExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		List<UserPage> list = userPageMapper.selectByExample(example);
		UserPage userPage = list.get(0);
		return userPage;
	}
	public int updateOne(User user)
	{
		user.setLoginIp(null);
		user.setLoginTime(null);
		user.setCrtm(null);
		return userMapper.updateByPrimaryKeySelective(user);
	}
	public int deleteOne(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}
}
