package zhku.zhou.asset.service.device;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zhku.zhou.asset.dao.DeviceReceiveMapper;
import zhku.zhou.asset.dao.DeviceReceivePageMapper;
import zhku.zhou.asset.dao.SelectMaxIdMapper;
import zhku.zhou.asset.entity.DeviceReceive;
import zhku.zhou.asset.entity.DeviceReceiveExample;
import zhku.zhou.asset.entity.DeviceReceiveExample.Criteria;
import zhku.zhou.asset.entity.DeviceReceivePage;
import zhku.zhou.asset.entity.DeviceReceivePageExample;

@Service
public class DeviceReceiveService {
	@Autowired
	private DeviceReceiveMapper deviceReceiveMapper;
	@Autowired
	private DeviceReceivePageMapper deviceReceivePageMapper;
	@Autowired
	private SelectMaxIdMapper selectMaxIdMapper;
	public List<DeviceReceivePage> selectAll()
	{
		DeviceReceivePageExample example = new DeviceReceivePageExample();
		return deviceReceivePageMapper.selectByExample(example);
	}
	public int addOne(DeviceReceive deviceReceive)
	{
		return deviceReceiveMapper.insertSelective(deviceReceive);
	}
	public int deleteOne(int id)
	{
		return deviceReceiveMapper.deleteByPrimaryKey(id);
	}
	public int updateOne(DeviceReceive deviceReceive)
	{
		return deviceReceiveMapper.updateByPrimaryKeySelective(deviceReceive);
	}
	public DeviceReceive selectOne(int id)
	{
		return deviceReceiveMapper.selectByPrimaryKey(id);
	}
	//选择最大单据号
	public DeviceReceive selectMaxId()
	{
		return selectMaxIdMapper.deviceReceiveMaxId();
	}
	public int deleteByDeviceId(int id)
	{
		DeviceReceiveExample example = new DeviceReceiveExample();
		Criteria criteria =  example.createCriteria();
		criteria.andDidEqualTo(id);
		return deviceReceiveMapper.deleteByExample(example);
	}
}
