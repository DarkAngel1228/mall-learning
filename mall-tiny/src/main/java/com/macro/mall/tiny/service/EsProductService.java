package com.macro.mall.tiny.service;

import com.macro.mall.tiny.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EsProductService {
    /**
     * 从数据库中导入所有商品到ES
     * @return int
     */
    int importAll();

    /**
     * 删除id商品
     * @param id 主键
     */
    void delete(Long id);

    EsProduct create(long id);

    void delete(List<Long> ids);

    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);

}
