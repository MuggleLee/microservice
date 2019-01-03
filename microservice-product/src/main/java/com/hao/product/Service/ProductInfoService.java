package com.hao.product.Service;

import com.hao.product.Model.ProductInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductInfoService {
    List<ProductInfo> findAllUp();
}
