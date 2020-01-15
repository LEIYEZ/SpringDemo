package cn.imut.mapper;

import cn.imut.pojo.QueryVo;
import cn.imut.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
    //查询所以信息
    @Select("select * from user;")
    List<User> findAll();
    //增加信息
    @Insert("insert into user(username,address,sex,birthday)values(#{username},#{address},#{sex},#{birthday});")
    void saveUser(User user);
    //修改信息
    @Update("update user set username=#{username},address=#{address},sex=#{sex},birthday=#{birthday} where id=#{id};")
    void updateUser(User user);
    //删除信息(id删除)
    @Delete("delete from user where id = #{id};")
    void deleteUser(Integer userId);
    //查询信息(id查询)
    @Select("select * from user where id = #{id};")
    User findById(Integer userId);
    //模糊查询(姓名)
    @Select("select * from user where username like #{username};")
    List<User> findByName(String username);
    //查询总用户数
    @Select("select count(id) from user;")
    int findTotal();
    //根据queryVo中的条件查询
    @Select("select * from user where username like #{user.username};")
    List<User> findUserByVo(QueryVo vo);
}
