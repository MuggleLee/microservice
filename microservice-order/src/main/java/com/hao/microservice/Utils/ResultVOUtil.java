package com.hao.microservice.Utils;

import com.hao.microservice.VO.ResultVO;

/**
 * @author Muggle Lee
 * @since 2019-01-04
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
