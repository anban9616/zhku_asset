package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.DevicePage;
import zhku.zhou.asset.entity.DevicePageExample;

public interface DevicePageMapper {
    int countByExample(DevicePageExample example);

    int deleteByExample(DevicePageExample example);

    int insert(DevicePage record);

    int insertSelective(DevicePage record);

    List<DevicePage> selectByExample(DevicePageExample example);

    int updateByExampleSelective(@Param("record") DevicePage record, @Param("example") DevicePageExample example);

    int updateByExample(@Param("record") DevicePage record, @Param("example") DevicePageExample example);
}