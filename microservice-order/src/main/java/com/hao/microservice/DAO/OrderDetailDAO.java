package com.hao.microservice.DAO;

import com.hao.microservice.Model.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Muggle Lee
 * @Date: 2019/1/3 17:45
 */
public interface OrderDetailDAO extends JpaRepository<OrderMaster,String> {
}
