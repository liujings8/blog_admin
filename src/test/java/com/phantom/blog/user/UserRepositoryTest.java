package com.phantom.blog.user;

import com.alibaba.fastjson.JSONObject;
import com.phantom.blog.Application;
import com.phantom.blog.dictionary.DictionaryInfo;
import com.phantom.blog.dictionary.DictionaryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Classname: UserRepositoryTest
 * @Description: TODO()
 * @Author: phantom
 * @Created: 2018/1/25 15:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveTest(){
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(25);
        userInfo.setLoginName("phantom");
        userInfo.setUserName("liujingsong");
        userRepository.save(userInfo);
    }

    @Test
    public void findAllTest(){
        List<UserInfo> userInfoList = (List<UserInfo>) userRepository.findAll();
        System.err.println(JSONObject.toJSONString(userInfoList));
    }

    @Test
    public void deleteTest(){
        UserInfo userInfo = new UserInfo();
        userInfo.setLoginName("phantom");
        userRepository.delete(userInfo);
    }
}
