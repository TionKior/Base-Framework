package com.tionkior.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tionkior.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author TionKior
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {

    User findUserById(int id);

    List<User> findAll();

}
