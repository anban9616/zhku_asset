package zhku.zhou.asset.service.device;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zhku.zhou.asset.dao.DeviceOutMapper;
import zhku.zhou.asset.dao.DeviceOutPageMapper;
import zhku.zhou.asset.entity.DeviceOut;
import zhku.zhou.asset.entity.DeviceOutPage;
import zhku.zhou.asset.entity.DeviceOutPageExample;

@Service
public class DeviceOutService {
	@Autowired
	private DeviceOutMapper deviceOutMapper;
	@Autowired
	private DeviceOutPageMapper deviceOutPageMapper;
	public List<DeviceOutPage> selectAll()
	{
		DeviceOutPageExample example = new DeviceOutPageExample();
		return deviceOutPageMapper.selectByExample(example);
	}
	public int addOne(DeviceOut deviceOut)
	{
		return deviceOutMapper.insertSelective(deviceOut);
	}
	public int deleteOne(int id)
	{
		return deviceOutMapper.deleteByPrimaryKey(id);
	}
	public int updateOne(DeviceOut deviceOut)
	{
		return deviceOutMapper.updateByPrimaryKeySelective(deviceOut);
	}
	public DeviceOut selectOne(int id)
	{
		return deviceOutMapper.selectByPrimaryKey(id);
	}
}
