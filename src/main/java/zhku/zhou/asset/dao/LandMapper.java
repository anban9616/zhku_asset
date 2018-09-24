package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.Land;
import zhku.zhou.asset.entity.LandExample;

public interface LandMapper {
    int countByExample(LandExample example);

    int deleteByExample(LandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Land record);

    int insertSelective(Land record);

    List<Land> selectByExample(LandExample example);

    Land selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Land record, @Param("example") LandExample example);

    int updateByExample(@Param("record") Land record, @Param("example") LandExample example);

    int updateByPrimaryKeySelective(Land record);

    int updateByPrimaryKey(Land record);
}