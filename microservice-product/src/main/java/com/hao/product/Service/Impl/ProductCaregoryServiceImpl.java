package com.hao.product.Service.Impl;

import com.hao.product.DAO.ProductCategoryDAO;
import com.hao.product.Model.ProductCategory;
import com.hao.product.Service.ProductCaregoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Muggle Lee
 * @Date: 2019/1/3 15:48
 */
@Service
public class ProductCaregoryServiceImpl implements ProductCaregoryService {

    @Autowired
    private ProductCategoryDAO productCategoryDAO;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        List<ProductCategory> list = productCategoryDAO.findByCategoryTypeIn(categoryTypeList);
        return list;
    }
}
