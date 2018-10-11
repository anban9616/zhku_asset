package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.DeviceRepairPage;
import zhku.zhou.asset.entity.DeviceRepairPageExample;

public interface DeviceRepairPageMapper {
    int countByExample(DeviceRepairPageExample example);

    int deleteByExample(DeviceRepairPageExample example);

    int insert(DeviceRepairPage record);

    int insertSelective(DeviceRepairPage record);

    List<DeviceRepairPage> selectByExample(DeviceRepairPageExample example);

    int updateByExampleSelective(@Param("record") DeviceRepairPage record, @Param("example") DeviceRepairPageExample example);

    int updateByExample(@Param("record") DeviceRepairPage record, @Param("example") DeviceRepairPageExample example);
}