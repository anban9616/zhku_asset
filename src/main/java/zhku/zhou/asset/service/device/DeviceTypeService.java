package zhku.zhou.asset.service.device;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zhku.zhou.asset.dao.DeviceTypeMapper;
import zhku.zhou.asset.entity.DeviceType;
import zhku.zhou.asset.entity.DeviceTypeExample;

@Service
public class DeviceTypeService {
	@Autowired
	private DeviceTypeMapper deviceTypeMapper;
	public List<DeviceType> selectAll()
	{
		DeviceTypeExample example = new DeviceTypeExample();
		return deviceTypeMapper.selectByExample(example);
	}
}
