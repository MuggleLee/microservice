package com.hao.microservice.DAO;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Muggle Lee
 * @Date: 2019/1/3 17:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterDAOTest{


    @Autowired
    private OrderMasterDAO orderMasterDAO;

    @Test
    public void test(){
        Assert.assertNotNull(orderMasterDAO.getOne("1"));
    }

}