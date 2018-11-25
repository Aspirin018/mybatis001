package com.itheima.mybatis.mapper;

import com.itheima.mybatis.po.OrdersExt;
import com.itheima.mybatis.po.User;

import java.util.List;

/**
 * Created by liyu on 2018/1/30.
 */
public interface OrdersMapper {
    public List<OrdersExt> findOrdersAndUser();
    public List<OrdersExt> findOrdersAndUserRstMap();
    public List<OrdersExt> findOrdersAndDetailRstMap();
    public List<User> findUserAndItemsRstMap();
}
