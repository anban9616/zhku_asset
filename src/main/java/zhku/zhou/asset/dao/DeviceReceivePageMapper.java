package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.DeviceReceivePage;
import zhku.zhou.asset.entity.DeviceReceivePageExample;

public interface DeviceReceivePageMapper {
    int countByExample(DeviceReceivePageExample example);

    int deleteByExample(DeviceReceivePageExample example);

    int insert(DeviceReceivePage record);

    int insertSelective(DeviceReceivePage record);

    List<DeviceReceivePage> selectByExample(DeviceReceivePageExample example);

    int updateByExampleSelective(@Param("record") DeviceReceivePage record, @Param("example") DeviceReceivePageExample example);

    int updateByExample(@Param("record") DeviceReceivePage record, @Param("example") DeviceReceivePageExample example);
}