package com.chaowen.controller;

import com.chaowen.model.Result;
import com.chaowen.model.dto.ProductDTO;
import com.chaowen.model.vo.ProductVO;
import com.chaowen.service.ProductService;
import com.chaowen.service.SeriesService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/english/product")
public class ProductEController {

    private static Logger logger = LoggerFactory.getLogger(ProductEController.class);

    private Byte ENGLISH = 1;

    @Resource
    private ProductService productService;

    @Resource
    private SeriesService seriesService;
    /**
     * 产品列表
     * @param request
     * @param productDTO
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public Result getProductList(HttpServletRequest request, @RequestBody ProductDTO productDTO){
        //获取产品信息
        productDTO.setLang(ENGLISH);
        PageInfo<ProductVO> pageInfo = productService.queryByPage(productDTO);
        return new Result(true,pageInfo);
    }

    /**
     * 产品详情页面
     * @param request
     * @param id
     * @return
     */
    @RequestMapping(value = "/detail")
    @ResponseBody
    public Result getProductDetail(HttpServletRequest request,Long id){
        ProductDTO dto = new ProductDTO();
        dto.setId(id);
        ProductVO productVO = productService.queryById(dto);
        return new Result(true,productVO);
    }
}
