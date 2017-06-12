package com.zll.practice.domain;


import org.springframework.data.repository.Repository;


/**
 * Created by zliang on 17-6-4.
 */
public interface UserDao extends Repository<User,String> {

    public User save(User user);
    public User findUserByUsername(String username);


}
