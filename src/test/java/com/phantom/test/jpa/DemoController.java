package com.phantom.test.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname: DemoController
 * @Description: TODO()
 * @Author: phantom
 * @Created: 2018/1/25 11:36
 */
@RestController
public class DemoController {
    @Autowired
    private DemoDao demoDao;

    @RequestMapping("save")
    public String saveDao() {
        Demo demoInfo = new Demo();
        demoInfo.setName("张三");
        demoInfo.setAge(20);
        demoDao.save(demoInfo);

        demoInfo = new Demo();
        demoInfo.setName("李四");
        demoInfo.setAge(30);

        return "ok";
    }

    @RequestMapping("find")
    public List<Demo> find() {
        return (List<Demo>) demoDao.findAll();
    }

    @RequestMapping("findByName")
    public List<Demo> findByName() {
        return (List<Demo>) demoDao.findByName("张三");
    }

}
