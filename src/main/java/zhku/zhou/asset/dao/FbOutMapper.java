package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.FbOut;
import zhku.zhou.asset.entity.FbOutExample;

public interface FbOutMapper {
    int countByExample(FbOutExample example);

    int deleteByExample(FbOutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FbOut record);

    int insertSelective(FbOut record);

    List<FbOut> selectByExample(FbOutExample example);

    FbOut selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FbOut record, @Param("example") FbOutExample example);

    int updateByExample(@Param("record") FbOut record, @Param("example") FbOutExample example);

    int updateByPrimaryKeySelective(FbOut record);

    int updateByPrimaryKey(FbOut record);
}