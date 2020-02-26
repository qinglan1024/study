package com.qinglan.service;

import com.qinglan.mapper.UserMapper;
import com.qinglan.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
}
