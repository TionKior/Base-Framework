package com.tionkior.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName : User
 * @Author : TionKior
 * @Date : 2021/6/23 14:59
 * @Version : V1.0
 * @Description : POJO Class
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
@ApiModel("用户实体类")
public class User implements Serializable {

    @ApiModelProperty(value = "id", example = "0")
    private Long id;

    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("密码")
    private String password;

}