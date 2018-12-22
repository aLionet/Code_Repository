package com.lionet.service;

import com.lionet.domain.User;

import java.util.List;

/**
 * @author Lionet
 * @date 2018/12/20 18:46
 */
public interface IUserService {
    public  void saveSpring(User user);
    // 查询所有用户
    public List<User> findUser();
}
