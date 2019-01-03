package com.hao.microservice.Service.Impl;

import com.hao.microservice.DAO.OrderDetailDAO;
import com.hao.microservice.DAO.OrderMasterDAO;
import com.hao.microservice.DTO.OrderDTO;
import com.hao.microservice.Model.OrderDetail;
import com.hao.microservice.Model.OrderMaster;
import com.hao.microservice.Service.OrderService;
import com.hao.microservice.Utils.KeyUtil;
import com.hao.microservice.enums.OrderStatusEnum;
import com.hao.microservice.enums.PayStatusEnum;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Muggle Lee
 * @date 2019\1\3 0003 23:58
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMasterDAO orderMasterDAO;

    @Autowired
    private OrderDetailDAO orderDetailDAO;


    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        //获取订单Id
        String orderId = KeyUtil.genUniqueKey();
//        //查询商品信息(调用商品服务)
//        List<String> productIdList = orderDTO.getOrderDetailList().stream()
//                .map(OrderDetail::getProductId)
//                .collect(Collectors.toList());
//        List<ProductInfoOutput> productInfoList = productClient.listForOrder(productIdList);
//
//        //计算总价
//        BigDecimal orderAmout = new BigDecimal(BigInteger.ZERO);
//        for (OrderDetail orderDetail: orderDTO.getOrderDetailList()) {
//            for (ProductInfoOutput productInfo: productInfoList) {
//                if (productInfo.getProductId().equals(orderDetail.getProductId())) {
//                    //单价*数量
//                    orderAmout = productInfo.getProductPrice()
//                            .multiply(new BigDecimal(orderDetail.getProductQuantity()))
//                            .add(orderAmout);
//                    BeanUtils.copyProperties(productInfo, orderDetail);
//                    orderDetail.setOrderId(orderId);
//                    orderDetail.setDetailId(KeyUtil.genUniqueKey());
//                    //订单详情入库
//                    orderDetailRepository.save(orderDetail);
//                }
//            }
//        }
//
//        //扣库存(调用商品服务)
//        List<DecreaseStockInput> decreaseStockInputList = orderDTO.getOrderDetailList().stream()
//                .map(e -> new DecreaseStockInput(e.getProductId(), e.getProductQuantity()))
//                .collect(Collectors.toList());
//        productClient.decreaseStock(decreaseStockInputList);
//
//        //订单入库
//        OrderMaster orderMaster = new OrderMaster();
//        orderDTO.setOrderId(orderId);
//        BeanUtils.copyProperties(orderDTO, orderMaster);
//        orderMaster.setOrderAmount(orderAmout);
//        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
//        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
//        orderMasterRepository.save(orderMaster);
        return orderDTO;
    }
}