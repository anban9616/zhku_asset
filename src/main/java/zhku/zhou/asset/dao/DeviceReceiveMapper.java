package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.DeviceReceive;
import zhku.zhou.asset.entity.DeviceReceiveExample;

public interface DeviceReceiveMapper {
    int countByExample(DeviceReceiveExample example);

    int deleteByExample(DeviceReceiveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceReceive record);

    int insertSelective(DeviceReceive record);

    List<DeviceReceive> selectByExample(DeviceReceiveExample example);

    DeviceReceive selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceReceive record, @Param("example") DeviceReceiveExample example);

    int updateByExample(@Param("record") DeviceReceive record, @Param("example") DeviceReceiveExample example);

    int updateByPrimaryKeySelective(DeviceReceive record);

    int updateByPrimaryKey(DeviceReceive record);
}