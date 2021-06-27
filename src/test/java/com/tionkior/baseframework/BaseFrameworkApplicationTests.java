package com.tionkior.baseframework;

import com.tionkior.domain.User;
import com.tionkior.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BaseFrameworkApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;
    @Test
    public void findAllTest(){
        User all = userMapper.findAll(1);
        System.out.println(all);
    }

}
