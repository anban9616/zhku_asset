package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.CarReceive;
import zhku.zhou.asset.entity.CarReceiveExample;

public interface CarReceiveMapper {
    int countByExample(CarReceiveExample example);

    int deleteByExample(CarReceiveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarReceive record);

    int insertSelective(CarReceive record);

    List<CarReceive> selectByExample(CarReceiveExample example);

    CarReceive selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarReceive record, @Param("example") CarReceiveExample example);

    int updateByExample(@Param("record") CarReceive record, @Param("example") CarReceiveExample example);

    int updateByPrimaryKeySelective(CarReceive record);

    int updateByPrimaryKey(CarReceive record);
}