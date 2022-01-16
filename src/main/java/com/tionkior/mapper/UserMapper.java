package com.tionkior.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tionkior.pojo.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * @author TionKior
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {

    User findUserById(int id);

    List<User> findAll();

}
