package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.CarRepair;
import zhku.zhou.asset.entity.CarRepairExample;

public interface CarRepairMapper {
    int countByExample(CarRepairExample example);

    int deleteByExample(CarRepairExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarRepair record);

    int insertSelective(CarRepair record);

    List<CarRepair> selectByExample(CarRepairExample example);

    CarRepair selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarRepair record, @Param("example") CarRepairExample example);

    int updateByExample(@Param("record") CarRepair record, @Param("example") CarRepairExample example);

    int updateByPrimaryKeySelective(CarRepair record);

    int updateByPrimaryKey(CarRepair record);
}