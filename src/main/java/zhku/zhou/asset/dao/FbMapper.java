package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.Fb;
import zhku.zhou.asset.entity.FbExample;

public interface FbMapper {
    int countByExample(FbExample example);

    int deleteByExample(FbExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Fb record);

    int insertSelective(Fb record);

    List<Fb> selectByExample(FbExample example);

    Fb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Fb record, @Param("example") FbExample example);

    int updateByExample(@Param("record") Fb record, @Param("example") FbExample example);

    int updateByPrimaryKeySelective(Fb record);

    int updateByPrimaryKey(Fb record);
}