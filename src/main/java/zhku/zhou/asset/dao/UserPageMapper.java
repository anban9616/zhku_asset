package zhku.zhou.asset.dao;

import java.util.List;

import zhku.zhou.asset.entity.UserPage;

public interface UserPageMapper {
	public List<UserPage> selectAll();
	public UserPage selectOne(Integer id);
}
