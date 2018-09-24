package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.DeviceOut;
import zhku.zhou.asset.entity.DeviceOutExample;

public interface DeviceOutMapper {
    int countByExample(DeviceOutExample example);

    int deleteByExample(DeviceOutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceOut record);

    int insertSelective(DeviceOut record);

    List<DeviceOut> selectByExample(DeviceOutExample example);

    DeviceOut selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceOut record, @Param("example") DeviceOutExample example);

    int updateByExample(@Param("record") DeviceOut record, @Param("example") DeviceOutExample example);

    int updateByPrimaryKeySelective(DeviceOut record);

    int updateByPrimaryKey(DeviceOut record);
}