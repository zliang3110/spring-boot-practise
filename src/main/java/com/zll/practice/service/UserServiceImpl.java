package com.zll.practice.service;

import com.zll.practice.domain.User;
import com.zll.practice.domain.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zliang on 17-6-4.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public User createUser(User user) {
        User result = userDao.save(user);
        return result;
    }
}
