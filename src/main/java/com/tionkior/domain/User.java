package com.tionkior.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName : User
 * @Author : TionKior
 * @Date : 2021/6/23 14:59
 * @Version : V1.0
 * @Description : POJO Class
 */

@Data //提供各种方法
@NoArgsConstructor // 提供无参构造方法
@AllArgsConstructor // 提供带参构造方法
@TableName("user") // 数据库表名映射
public class User {

    private Long id;

    private String username;
    private String password;

}
