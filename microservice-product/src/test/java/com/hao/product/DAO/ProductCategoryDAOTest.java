package com.hao.product.DAO;

import com.hao.product.Model.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDAOTest {

    @Autowired
    private ProductCategoryDAO productCategoryDAO;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = productCategoryDAO.findByCategoryTypeIn(Arrays.asList(1));
        Assert.assertTrue(list.size() > 0);
    }
}