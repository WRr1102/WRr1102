package com.wrr.capoo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wrr.capoo.entity.User;


public interface UserMapper extends BaseMapper<User> {

//    @Select("SELECT * FROM sys_user")
//    List<User> findAll();
//
//    @Insert("INSERT into sys_user(username,password,nickname,email,phone,address) VALUES (#{username}, #{password},#{nickname},#{email},#{phone},#{address})")
//    int insert(User user);
//
//
//    int update(User user);
//
//    @Delete("delete from sys_user where id = #{id}")
//    Integer deleteById(@Param("id") Integer id);
//
//    @Select("select * from sys_user where username like #{username} limit #{pageNum},#{pageSize}")
//    List<User> selectPage(Integer pageNum, Integer pageSize,String username);
//
//    @Select("select count(*) from sys_user where username like concat('%',#{username},'%')")
//    Integer selectTotal(String username);
}
