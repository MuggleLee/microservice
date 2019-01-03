package com.hao.product.DAO;

import com.hao.product.Model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@Repository
public interface ProductInfoDAO extends JpaRepository<ProductInfo, String> {
//        List<ProductInfo> findProductInfoByProductStatus(Integer productStatus);
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
