package com.hao.microservice.DAO;

import com.hao.microservice.Model.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Muggle Lee
 * @Date: 2019/1/3 17:44
 */
public interface OrderMasterDAO extends JpaRepository<OrderMaster,String> {

}
