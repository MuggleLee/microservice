package com.hao.product.Service.Impl;

import com.hao.product.DAO.ProductInfoDAO;
import com.hao.product.Enum.ProductStatusEnum;
import com.hao.product.Model.ProductInfo;
import com.hao.product.Service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoDAO productInfoDAO;

    /**
     * 查询所有在架商品
     * @return
     */
    @Override
    public List<ProductInfo> findAllUp() {
        return productInfoDAO.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
