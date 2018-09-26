package zhku.zhou.asset.service.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zhku.zhou.asset.dao.RoleMapper;
import zhku.zhou.asset.entity.Role;
import zhku.zhou.asset.entity.RoleExample;

@Service
public class RoleService {
	@Autowired 
	private RoleMapper roleMapper;
	
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

	public List<Role> getAll() {
		RoleExample example = new RoleExample();
		return roleMapper.selectByExample(example);
	}
}
