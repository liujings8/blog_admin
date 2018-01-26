package com.phantom.blog.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Classname: UserInfo
 * @Description: TODO()
 * @Author: phantom
 * @Created: 2018/1/25 14:33
 */
@Entity
@Table(name="SYS_USER")
//@TableGenerator()
@Getter
@Setter
public class UserInfo {
    /**
     * 用户ID
     */
    @Id
    @GeneratedValue
    @Column(name = "L_USER_ID")
    private Long userId;
    /**
     * 用户名
     */
    @Column(name="VC_USER_NAME",length = 200)
    private String userName;
    /**
     * 登录名
     */
    @Column(name="VC_LOGIN_NAME")
    private String loginName;
    /**
     *  年龄
     */
    @Column(name="L_AGE")
    private Integer age;
}
