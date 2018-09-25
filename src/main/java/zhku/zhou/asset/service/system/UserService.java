package zhku.zhou.asset.service.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zhku.zhou.asset.dao.UserPageMapper;
import zhku.zhou.asset.entity.UserPage;


@Service
public class UserService {
	@Autowired
	private UserPageMapper userPageMapper;
	public List<UserPage> getAll()
	{
		List<UserPage> list = userPageMapper.selectAll();
		return list;
	}
}
