package com.hao.microservice.VO;

import lombok.Data;

/**
 * @author Muggle Lee
 * @since 2019-01-04
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
