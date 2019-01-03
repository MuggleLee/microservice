package com.hao.product.Service;

import com.hao.product.Model.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author Muggle Lee
 * @Date: 2019/1/3 15:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCaregoryServiceTest{

    @Autowired
    private ProductCaregoryService productCaregoryService;

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> list = productCaregoryService.findByCategoryTypeIn(Arrays.asList(1,2));
        Assert.assertTrue(list.size()>0);
    }
}