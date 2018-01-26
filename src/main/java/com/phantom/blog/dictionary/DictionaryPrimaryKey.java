package com.phantom.blog.dictionary;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Classname: DictionaryPK
 * @Description: TODO()
 * @Author: phantom
 * @Created: 2018/1/25 15:24
 */
@Getter
@Setter
public class DictionaryPrimaryKey implements Serializable {
    private String dimCode;
    private String dimType;

    @Override
    public int hashCode() {
        return Objects.hash(dimCode, dimType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DictionaryPrimaryKey)) {
            return false;
        }
        DictionaryPrimaryKey that = (DictionaryPrimaryKey) o;
        return Objects.equals(dimCode, that.dimCode) &&
                Objects.equals(dimType, that.dimType);
    }
}