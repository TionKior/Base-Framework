package com.tionkior.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tionkior.pojo.User;

/**
 * @author TionKior
 */

public interface UserService extends IService<User> {

    /**
     * Save User Data
     *
     * @param user
     */
    void saveUser(User user);

}
