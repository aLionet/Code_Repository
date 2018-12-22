package com.lionet.dao;

import com.lionet.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Lionet
 * @date 2018/12/20 18:48
 */
@Repository("daoUser")
public interface UserDao {
    public void testMybatis();

    @Insert("insert into user (username,birthday,sex,address) values (#{username},#{birthday},#{sex},#{address})")
    public void savaUser(User user);

    //查询所有用户
    @Select("select * from user")
    public List<User> findUser();
}
