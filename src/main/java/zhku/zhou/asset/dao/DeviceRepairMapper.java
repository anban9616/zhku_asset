package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.DeviceRepair;
import zhku.zhou.asset.entity.DeviceRepairExample;

public interface DeviceRepairMapper {
    int countByExample(DeviceRepairExample example);

    int deleteByExample(DeviceRepairExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceRepair record);

    int insertSelective(DeviceRepair record);

    List<DeviceRepair> selectByExample(DeviceRepairExample example);

    DeviceRepair selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceRepair record, @Param("example") DeviceRepairExample example);

    int updateByExample(@Param("record") DeviceRepair record, @Param("example") DeviceRepairExample example);

    int updateByPrimaryKeySelective(DeviceRepair record);

    int updateByPrimaryKey(DeviceRepair record);
}