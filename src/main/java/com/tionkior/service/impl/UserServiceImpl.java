package com.tionkior.service.impl;

import com.tionkior.domain.User;
import com.tionkior.mapper.UserMapper;
import com.tionkior.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName : UserServiceImpl
 * @Author : TionKior
 * @Date : 2021/6/23 14:59
 * @Version : V1.0
 * @Description : UserServiceImpl
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(User user) {
        userMapper.insert(user);
    }

    
}
