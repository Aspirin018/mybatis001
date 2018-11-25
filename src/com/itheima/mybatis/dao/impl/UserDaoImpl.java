package com.itheima.mybatis.dao.impl;

import com.itheima.mybatis.dao.UserDao;
import com.itheima.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by liyu on 2018/1/28.
 */
public class UserDaoImpl implements UserDao {
    private SqlSessionFactory sqlSessionFactory;
    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public User findUserbyId(int id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserById",  1);
        System.out.println("user: " + user);
        sqlSession.close();
        return sqlSession.selectOne("test.findUserById",  1);
    }

    @Override
    public List<User> findUsersByName(String name) throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> list = sqlSession.selectList("test.findUsersByName", "小明");
        System.out.println("list: " + list);
        sqlSession.close();
        return sqlSession.selectList("test.findUsersByName", "小明");
    }

    @Override
    public void insert(User user) throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user1 = new User();
        user1.setUsername("liyu");
        user1.setSex("f");
        user1.setAddress("科技路");
        sqlSession.insert("test.insertUser", user1);
        System.out.print("id:" + user1.getId());
        sqlSession.commit();
        sqlSession.close();
    }
}
