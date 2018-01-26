package com.phantom.blog.dictionay;

import com.alibaba.fastjson.JSONObject;
import com.phantom.blog.Application;
import com.phantom.blog.dictionary.DictionaryInfo;
import com.phantom.blog.dictionary.DictionaryPrimaryKey;
import com.phantom.blog.dictionary.DictionaryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
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
public class DictionaryRepositoryTest {
    @Autowired
    private DictionaryRepository dictionaryRepository;
    @Autowired
    private JpaProperties jpaProperties;
    @Autowired
    private DataSourceProperties dataSourceProperties;

    @Test
    public void saveTest() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.setDimCode("0");
        dictionaryInfo.setDimName("男");
        dictionaryInfo.setDimOrder(1);
        dictionaryInfo.setDimType("sexType");
        dictionaryInfo.setDimTypeName("性别");
        dictionaryInfo.setDimEdit('0');
        dictionaryInfo.setDimStatus('1');
        dictionaryRepository.save(dictionaryInfo);

        dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.setDimCode("1");
        dictionaryInfo.setDimName("女");
        dictionaryInfo.setDimOrder(2);
        dictionaryInfo.setDimType("sexType");
        dictionaryInfo.setDimTypeName("性别");
        dictionaryInfo.setDimEdit('0');
        dictionaryInfo.setDimStatus('1');
        dictionaryRepository.save(dictionaryInfo);
    }

    @Test
    public void selectAllTest() {
        List<DictionaryInfo> dictionaryInfoList = (List<DictionaryInfo>) dictionaryRepository.findAll();
        System.err.println(JSONObject.toJSONString(dictionaryInfoList));
    }

    @Test
    public void findOneTest() {
        DictionaryPrimaryKey dictionaryPrimaryKey = new DictionaryPrimaryKey();
        dictionaryPrimaryKey.setDimCode("1");
        dictionaryPrimaryKey.setDimType("sexType");
        DictionaryInfo dictionaryInfo = dictionaryRepository.findOne(dictionaryPrimaryKey);
        System.err.println(JSONObject.toJSONString(dictionaryInfo));
    }

    @Test
    public void deleteTest() {
        DictionaryPrimaryKey dictionaryPrimaryKey = new DictionaryPrimaryKey();
        dictionaryPrimaryKey.setDimType("sexType");
        dictionaryPrimaryKey.setDimCode("1");
        dictionaryRepository.delete(dictionaryPrimaryKey);
    }

}
