package com.itheima.mybatis.dao;

import com.itheima.mybatis.po.User;

import java.io.IOException;
import java.util.List;

/**
 * Created by liyu on 2018/1/28.
 */
public interface UserDao {
    public User findUserbyId(int id) throws Exception;
    public List<User> findUsersByName(String name) throws Exception;
    public void insert(User user) throws Exception;
}
