package com.phantom.test.jpa;

import org.springframework.data.repository.CrudRepository;

/**
 * @Classname: DemoDao
 * @Description: TODO()
 * @Author: phantom
 * @Created: 2018/1/25 11:35
 */
public interface DemoDao extends CrudRepository<Demo, Long> {
    Demo findByName(String name);
}
