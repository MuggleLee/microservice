package com.hao.microservice.exception;

import com.hao.microservice.enums.ResultEnum;

/**
 * @author Muggle Lee
 * @since 2019-01-04
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
