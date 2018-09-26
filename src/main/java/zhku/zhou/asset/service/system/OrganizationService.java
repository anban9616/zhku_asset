package zhku.zhou.asset.service.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zhku.zhou.asset.dao.OrganizationMapper;
import zhku.zhou.asset.entity.Organization;
import zhku.zhou.asset.entity.OrganizationExample;
@Service
public class OrganizationService {
	@Autowired
	private OrganizationMapper organizationMapper;
	
	public List<Organization> getAll() {
		OrganizationExample example = new OrganizationExample();
		return organizationMapper.selectByExample(example);
	}

	public Organization selectOne(Integer id) {
		return organizationMapper.selectByPrimaryKey(id);
	}

	public int updateOne(Organization organization) {
		return organizationMapper.updateByPrimaryKeySelective(organization);
	}

	public int addOne(Organization organization) {
		return organizationMapper.insertSelective(organization);
	}

	public int deleteOne(int id) {
		return organizationMapper.deleteByPrimaryKey(id);
	}

}
