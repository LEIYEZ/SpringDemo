package cn.imut.mapper;

import cn.imut.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    //查询所有
    @Select("select * from user")
    List<User> findAll();
}
