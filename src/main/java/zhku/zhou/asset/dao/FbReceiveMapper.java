package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.FbReceive;
import zhku.zhou.asset.entity.FbReceiveExample;

public interface FbReceiveMapper {
    int countByExample(FbReceiveExample example);

    int deleteByExample(FbReceiveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FbReceive record);

    int insertSelective(FbReceive record);

    List<FbReceive> selectByExample(FbReceiveExample example);

    FbReceive selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FbReceive record, @Param("example") FbReceiveExample example);

    int updateByExample(@Param("record") FbReceive record, @Param("example") FbReceiveExample example);

    int updateByPrimaryKeySelective(FbReceive record);

    int updateByPrimaryKey(FbReceive record);
}