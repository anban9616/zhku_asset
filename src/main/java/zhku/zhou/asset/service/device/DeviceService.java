package zhku.zhou.asset.service.device;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zhku.zhou.asset.dao.DeviceMapper;
import zhku.zhou.asset.dao.DevicePageMapper;
import zhku.zhou.asset.dao.SelectMaxIdMapper;
import zhku.zhou.asset.entity.Device;
import zhku.zhou.asset.entity.DeviceExample;
import zhku.zhou.asset.entity.DeviceExample.Criteria;
import zhku.zhou.asset.entity.DevicePage;
import zhku.zhou.asset.entity.DevicePageExample;

@Service
public class DeviceService {
	@Autowired
	private DevicePageMapper devicePageMapper;
	@Autowired 
	private DeviceMapper deviceMapper;
	@Autowired
	private SelectMaxIdMapper selectMaxIdMapper;
	public List<DevicePage> selectAll()
	{
		DevicePageExample example = new DevicePageExample();
		return devicePageMapper.selectByExample(example);
	}
	public List<Device> selectAll2()
	{
		DeviceExample example = new DeviceExample();
		Criteria criteria = example.createCriteria();
		//选择在库存中的设备
		criteria.andStatusEqualTo((short) 1);
		return deviceMapper.selectByExample(example);
	}
	public int addOne(Device device)
	{
		return deviceMapper.insertSelective(device);
	}
	public int deleteOne(int id)
	{
		return deviceMapper.deleteByPrimaryKey(id);
	}
	public Device selectOne(int id)
	{
		DeviceExample example = new DeviceExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		List<Device> list = deviceMapper.selectByExample(example);
		Device device = list.get(0);
		return device;
	}
	public int updateOne(Device device)
	{
		return deviceMapper.updateByPrimaryKeySelective(device);
	}
	public Device selectMaxId()
	{
		return selectMaxIdMapper.deviceMaxId();
	}
}
