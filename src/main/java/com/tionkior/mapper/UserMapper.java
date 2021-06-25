package com.tionkior.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tionkior.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author TionKior
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
