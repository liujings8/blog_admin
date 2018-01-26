package com.phantom.blog.dictionary;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Classname: DictionaryInfo
 * @Description: TODO()
 * @Author: phantom
 * @Created: 2018/1/25 14:45
 */
@Entity
@Table(name = "e_dim")
//@TableGenerator()
@Getter
@Setter
@IdClass(DictionaryPrimaryKey.class)
public class DictionaryInfo {

    /**
     * 字典code
     */
    @Id
    @Column(name = "dim_cde")
    private String dimCode;

    /**
     * 字典名称
     */
    @Column(name = "dim_nme")
    private String dimName;

    /**
     * 字典顺序
     */
    @Column(name = "dim_ord")
    private Integer dimOrder;

    /**
     * 字典类型
     */
    @Id
    @Column(name = "dim_type")
    private String dimType;

    /**
     * 字典类型名称
     */
    @Column(name = "dim_typename")
    private String dimTypeName;

    /**
     * 字典状态
     */
    @Column(name = "dim_status")
    private char dimStatus;
    
    /**
     * 字典是否可以编辑
     */
    @Column(name = "dim_edit")
    private char dimEdit;
}
