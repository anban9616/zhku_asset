package zhku.zhou.asset.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhku.zhou.asset.entity.UserPage;
import zhku.zhou.asset.entity.UserPageExample;

public interface UserPageMapper {
    int countByExample(UserPageExample example);

    int deleteByExample(UserPageExample example);

    int insert(UserPage record);

    int insertSelective(UserPage record);

    List<UserPage> selectByExample(UserPageExample example);

    int updateByExampleSelective(@Param("record") UserPage record, @Param("example") UserPageExample example);

    int updateByExample(@Param("record") UserPage record, @Param("example") UserPageExample example);
}