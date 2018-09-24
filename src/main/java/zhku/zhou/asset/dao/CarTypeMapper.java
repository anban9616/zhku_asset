package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.CarType;
import zhku.zhou.asset.entity.CarTypeExample;

public interface CarTypeMapper {
    int countByExample(CarTypeExample example);

    int deleteByExample(CarTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarType record);

    int insertSelective(CarType record);

    List<CarType> selectByExample(CarTypeExample example);

    CarType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarType record, @Param("example") CarTypeExample example);

    int updateByExample(@Param("record") CarType record, @Param("example") CarTypeExample example);

    int updateByPrimaryKeySelective(CarType record);

    int updateByPrimaryKey(CarType record);
}