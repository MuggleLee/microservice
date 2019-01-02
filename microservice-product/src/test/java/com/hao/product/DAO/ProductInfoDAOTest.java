package com.hao.product.DAO;

import com.hao.product.Model.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoDAOTest {

    @Autowired
    private ProductInfoDAO productInfoDAO;

    @Test
    public void findProductInfoByProductStatus() throws Exception{
        List<ProductInfo> list = productInfoDAO.findProductInfoByProductStatus(0);
        Assert.assertTrue(list.size() >0);
    }
}