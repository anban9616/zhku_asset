package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.DeviceType;
import zhku.zhou.asset.entity.DeviceTypeExample;

public interface DeviceTypeMapper {
    int countByExample(DeviceTypeExample example);

    int deleteByExample(DeviceTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceType record);

    int insertSelective(DeviceType record);

    List<DeviceType> selectByExample(DeviceTypeExample example);

    DeviceType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceType record, @Param("example") DeviceTypeExample example);

    int updateByExample(@Param("record") DeviceType record, @Param("example") DeviceTypeExample example);

    int updateByPrimaryKeySelective(DeviceType record);

    int updateByPrimaryKey(DeviceType record);
}