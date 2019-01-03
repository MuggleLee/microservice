package com.hao.product.Controller;

import com.hao.product.Model.ProductCategory;
import com.hao.product.Model.ProductInfo;
import com.hao.product.Service.ProductCaregoryService;
import com.hao.product.Service.ProductInfoService;
import com.hao.product.Utils.ResultVOUtil;
import com.hao.product.VO.ProductInfoVO;
import com.hao.product.VO.ProductVO;
import com.hao.product.VO.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author muggleLee
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    /**
     * 1. 查询所有在架的商品
     * 2. 获取类目type列表
     * 3. 查询类目
     * 4. 构造数据
     */

    @Autowired
    private ProductCaregoryService productCaregoryService;

    @Autowired
    private ProductInfoService productInfoService;

    @GetMapping("/list")
    public ResultVO<ProductVO> list(){
        List<ProductInfo> productInfoList = productInfoService.findAllUp();
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());
        List<ProductCategory> categoryList = productCaregoryService.findByCategoryTypeIn(categoryTypeList);

        //4. 构造数据
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory: categoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo: productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }
        return ResultVOUtil.success(productVOList);
    }

}
