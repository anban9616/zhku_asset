package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.FbRepair;
import zhku.zhou.asset.entity.FbRepairExample;

public interface FbRepairMapper {
    int countByExample(FbRepairExample example);

    int deleteByExample(FbRepairExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FbRepair record);

    int insertSelective(FbRepair record);

    List<FbRepair> selectByExample(FbRepairExample example);

    FbRepair selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FbRepair record, @Param("example") FbRepairExample example);

    int updateByExample(@Param("record") FbRepair record, @Param("example") FbRepairExample example);

    int updateByPrimaryKeySelective(FbRepair record);

    int updateByPrimaryKey(FbRepair record);
}