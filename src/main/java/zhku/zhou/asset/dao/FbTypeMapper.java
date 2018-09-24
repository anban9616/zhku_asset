package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.FbType;
import zhku.zhou.asset.entity.FbTypeExample;

public interface FbTypeMapper {
    int countByExample(FbTypeExample example);

    int deleteByExample(FbTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FbType record);

    int insertSelective(FbType record);

    List<FbType> selectByExample(FbTypeExample example);

    FbType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FbType record, @Param("example") FbTypeExample example);

    int updateByExample(@Param("record") FbType record, @Param("example") FbTypeExample example);

    int updateByPrimaryKeySelective(FbType record);

    int updateByPrimaryKey(FbType record);
}