package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.CarOut;
import zhku.zhou.asset.entity.CarOutExample;

public interface CarOutMapper {
    int countByExample(CarOutExample example);

    int deleteByExample(CarOutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarOut record);

    int insertSelective(CarOut record);

    List<CarOut> selectByExample(CarOutExample example);

    CarOut selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarOut record, @Param("example") CarOutExample example);

    int updateByExample(@Param("record") CarOut record, @Param("example") CarOutExample example);

    int updateByPrimaryKeySelective(CarOut record);

    int updateByPrimaryKey(CarOut record);
}