package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.HouseReceive;
import zhku.zhou.asset.entity.HouseReceiveExample;

public interface HouseReceiveMapper {
    int countByExample(HouseReceiveExample example);

    int deleteByExample(HouseReceiveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseReceive record);

    int insertSelective(HouseReceive record);

    List<HouseReceive> selectByExample(HouseReceiveExample example);

    HouseReceive selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HouseReceive record, @Param("example") HouseReceiveExample example);

    int updateByExample(@Param("record") HouseReceive record, @Param("example") HouseReceiveExample example);

    int updateByPrimaryKeySelective(HouseReceive record);

    int updateByPrimaryKey(HouseReceive record);
}