package com.phantom.blog.user;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @Classname: UserRepository
 * @Description: TODO()
 * @Author: phantom
 * @Created: 2018/1/25 14:50
 */
public interface UserRepository extends CrudRepository<UserInfo, Long> {
    /**
     * 根据用户名查询用户
     *
     * @param userName
     * @return
     */
    List<UserInfo> findByUserName(String userName);
}
