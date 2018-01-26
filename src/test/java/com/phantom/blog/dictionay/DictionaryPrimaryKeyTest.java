package com.phantom.blog.dictionay;

import com.phantom.blog.dictionary.DictionaryPrimaryKey;

import java.util.HashMap;

/**
 * @Classname: DictionaryPrimaryKeyTest
 * @Description: TODO()
 * @Author: phantom
 * @Created: 2018/1/25 18:03
 */
public class DictionaryPrimaryKeyTest {
    public static void main(String[] args) {
        DictionaryPrimaryKey dictionaryPrimaryKey1 = new DictionaryPrimaryKey();
        dictionaryPrimaryKey1.setDimType("sexType");
        dictionaryPrimaryKey1.setDimCode("1");
        DictionaryPrimaryKey dictionaryPrimaryKey2 = new DictionaryPrimaryKey();
        dictionaryPrimaryKey2.setDimType("sexType");
        dictionaryPrimaryKey2.setDimCode("1");
        System.err.println("dictionaryPrimaryKey1.equals(dictionaryPrimaryKey2)" + ":" + dictionaryPrimaryKey1.equals(dictionaryPrimaryKey2));
        System.err.println("dictionaryPrimaryKey1.hashCode" + ":" + dictionaryPrimaryKey1.hashCode());
        System.err.println("dictionaryPrimaryKey2.hashCode" + ":" + dictionaryPrimaryKey2.hashCode());

        HashMap<DictionaryPrimaryKey,Object> hashMap = new HashMap<>();
        hashMap.put(dictionaryPrimaryKey1,"phantomLiu");
        System.err.println(hashMap.get(dictionaryPrimaryKey2));
    }
}
