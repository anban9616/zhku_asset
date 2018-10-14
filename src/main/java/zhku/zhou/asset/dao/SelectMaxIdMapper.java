package zhku.zhou.asset.dao;

import zhku.zhou.asset.entity.Device;
import zhku.zhou.asset.entity.DeviceReceive;

public interface SelectMaxIdMapper {
	public DeviceReceive deviceReceiveMaxId();
	public Device deviceMaxId();
}
