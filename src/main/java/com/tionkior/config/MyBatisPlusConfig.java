package com.tionkior.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : MyBatisPlusConfig
 * @Author : TionKior
 * @Date : 2021/8/6 10:25
 * @Version : V1.0
 * @Description : MyBatisPlus Config
 */

@Configuration
public class MyBatisPlusConfig {

    /**
     * 加载分页助手
     * @return
     */
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }

}
