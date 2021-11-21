package com.macro.mall.tiny.nosql.elasticsearch.document;


import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

public class EsProductAttributeValue implements Serializable {
    private static final long serialVersionUID = 1L;
    private long id;
    private long productAttributeId;

    @Field(type = FieldType.Keyword)
    private String value;
    private Integer type;
    @Field(type = FieldType.Keyword)
    private String name;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
