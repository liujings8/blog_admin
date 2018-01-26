package com.phantom.blog.dictionary;

import org.springframework.data.repository.CrudRepository;

/**
 * @Classname: DictionaryRepository
 * @Description: TODO()
 * @Author: phantom
 * @Created: 2018/1/25 15:09
 */
public interface DictionaryRepository extends CrudRepository<DictionaryInfo, DictionaryPrimaryKey> {
}
