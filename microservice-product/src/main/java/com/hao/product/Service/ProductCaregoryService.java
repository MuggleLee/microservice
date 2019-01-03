package com.hao.product.Service;

import com.hao.product.Model.ProductCategory;

import java.util.List;

/**
 * @author Muggle Lee
 * @Date: 2019/1/3 15:46
 */

public interface ProductCaregoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
