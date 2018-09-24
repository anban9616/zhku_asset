package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.LandReceive;
import zhku.zhou.asset.entity.LandReceiveExample;

public interface LandReceiveMapper {
    int countByExample(LandReceiveExample example);

    int deleteByExample(LandReceiveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LandReceive record);

    int insertSelective(LandReceive record);

    List<LandReceive> selectByExample(LandReceiveExample example);

    LandReceive selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LandReceive record, @Param("example") LandReceiveExample example);

    int updateByExample(@Param("record") LandReceive record, @Param("example") LandReceiveExample example);

    int updateByPrimaryKeySelective(LandReceive record);

    int updateByPrimaryKey(LandReceive record);
}