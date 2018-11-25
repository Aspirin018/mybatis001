package com.itheima.mybatis.mapper;

import com.itheima.mybatis.po.User;
import com.itheima.mybatis.po.UserQueryVO;

import java.util.List;

/**
 * Created by liyu on 2018/1/29.
 */
public interface UserMapper {
    public User findUserbyId(int id) throws Exception;
    public List<User> findUsersByName(String name) throws Exception;
    public void insert(User user) throws Exception;

    public List<User> findUserList(UserQueryVO vo);
    public int findUserCount(UserQueryVO vo);
    public User findUserRstMap(int id);
}
