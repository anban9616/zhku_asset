package zhku.zhou.asset.service.device;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zhku.zhou.asset.dao.DeviceRepairMapper;
import zhku.zhou.asset.dao.DeviceRepairPageMapper;
import zhku.zhou.asset.entity.DeviceRepair;
import zhku.zhou.asset.entity.DeviceRepairPage;
import zhku.zhou.asset.entity.DeviceRepairPageExample;

@Service
public class DeviceRepairService {
	@Autowired
	private DeviceRepairPageMapper deviceRepairPageMapper;
	@Autowired
	private DeviceRepairMapper deviceRepairMapper;
	public List<DeviceRepairPage> selectAll()
	{
		DeviceRepairPageExample example = new DeviceRepairPageExample();
		return deviceRepairPageMapper.selectByExample(example);
	}
	public int addOne(DeviceRepair deviceRepair)
	{
		return deviceRepairMapper.insertSelective(deviceRepair);
	}
	public int deleteOne(int id)
	{
		return deviceRepairMapper.deleteByPrimaryKey(id);
	}
	public int updateOne(DeviceRepair deviceRepair)
	{
		return deviceRepairMapper.updateByPrimaryKeySelective(deviceRepair);
	}
	public DeviceRepair selectOne(int id)
	{
		return deviceRepairMapper.selectByPrimaryKey(id);
	}
}
