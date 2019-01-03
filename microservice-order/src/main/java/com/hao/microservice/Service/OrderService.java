package com.hao.microservice.Service;

import com.hao.microservice.DTO.OrderDTO;

/**
 * @author Muggle Lee
 * @since 2019-01-03
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
