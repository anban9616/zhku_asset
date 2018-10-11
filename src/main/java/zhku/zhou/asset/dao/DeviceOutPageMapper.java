package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.DeviceOutPage;
import zhku.zhou.asset.entity.DeviceOutPageExample;

public interface DeviceOutPageMapper {
    int countByExample(DeviceOutPageExample example);

    int deleteByExample(DeviceOutPageExample example);

    int insert(DeviceOutPage record);

    int insertSelective(DeviceOutPage record);

    List<DeviceOutPage> selectByExample(DeviceOutPageExample example);

    int updateByExampleSelective(@Param("record") DeviceOutPage record, @Param("example") DeviceOutPageExample example);

    int updateByExample(@Param("record") DeviceOutPage record, @Param("example") DeviceOutPageExample example);
}