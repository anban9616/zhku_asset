package zhku.zhou.asset.service.device;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zhku.zhou.asset.dao.DevicePageMapper;
import zhku.zhou.asset.entity.DevicePage;
import zhku.zhou.asset.entity.DevicePageExample;

@Service
public class DeviceService {
	@Autowired
	private DevicePageMapper devicePageMapper;
	public List<DevicePage> selectAll()
	{
		DevicePageExample example = new DevicePageExample();
		return devicePageMapper.selectByExample(example);
	}
}
