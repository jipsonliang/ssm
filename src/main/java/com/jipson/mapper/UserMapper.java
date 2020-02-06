package com.jipson.mapper;

import com.jipson.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<User> selAllUser();
}
