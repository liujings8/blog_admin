package com.phantom.blog.build.jpa;

import com.alibaba.fastjson.JSONObject;
import com.phantom.blog.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Classname: DemoDaoTest
 * @Description: TODO()
 * @Author: phantom
 * @Created: 2018/1/25 13:12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class DemoDaoTest {
    @Autowired
    private DemoDao demoDao;
    @Autowired
    JpaProperties jpaProperties;

    @Test
    public void saveTest() {
        Demo demoInfo = new Demo();
        demoInfo.setName("张三");
        demoInfo.setAge(20);
        demoDao.save(demoInfo);
    }

    @Test
    public void findOneTest() {
        Demo demoInfo = demoDao.findOne(3L);
        System.err.println(JSONObject.toJSONString(demoInfo));
    }

    @Test
    public void findAllTest(){
        List<Demo> demoList = (List<Demo>) demoDao.findAll();
        System.err.println(JSONObject.toJSONString(demoList));
    }

}
