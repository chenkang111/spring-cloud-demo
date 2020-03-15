package com.chenkang.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * 用户实体类
 * 无参构造一定要给
 * 不然fasTJson 进行序列化的时候会出现异常
 * </p>
 *
 * @author chenkang
 * @since 2020/3/15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "builder")
public class User implements Serializable {


    /**
     * 用户标识
     */
    private String id;
    /**
     * 用户名称
     */
    private String userName;

    /**
     * 密码
     */
    private String pwd;

}
