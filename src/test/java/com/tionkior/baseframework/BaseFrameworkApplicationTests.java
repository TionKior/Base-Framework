package com.tionkior.baseframework;

import com.tionkior.pojo.User;
import com.tionkior.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BaseFrameworkApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;
    @Test
    public void findUserByIdTest(){
        User user = userMapper.findUserById(100);
        System.out.println(user);
    }

    @Test
    public void findAllTest(){
        List<User> all = userMapper.findAll();
        System.out.println(all);
    }

}
