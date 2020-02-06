package com.jipson.test;

import com.jipson.mapper.UserMapper;
import com.jipson.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class TestUser {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelAllUser(){
        List<User> users = userMapper.selAllUser();
        System.out.println(users);
    }
}
