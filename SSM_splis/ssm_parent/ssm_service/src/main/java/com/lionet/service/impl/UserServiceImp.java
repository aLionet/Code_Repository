package com.lionet.service.impl;

import com.lionet.dao.UserDao;
import com.lionet.domain.User;
import com.lionet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author Lionet
 * @date 2018/12/20 18:46
 */
@Service("userService")
public class UserServiceImp implements IUserService {
    @Autowired
    private UserDao userDao;

    public void saveSpring(User user) {
        System.out.println("service层被调用了");
        userDao.savaUser(user);
        // 模拟错误
        // int i = 10 /0;
        userDao.savaUser(user);

    }

    // 查询所游用户
    public List<User> findUser() {
         List<User> user = userDao.findUser();
        return user;
    }
}
