package com.hao.product.Service;

import com.hao.product.Model.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Muggle Lee
 * @Date: 2019/1/3 15:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceTest {

    @Autowired
    private ProductInfoService productInfoService;

    @Test
    public void findAllUp() {
        List<ProductInfo> list =  productInfoService.findAllUp();
        Assert.assertTrue(list.size() > 0);
    }
}