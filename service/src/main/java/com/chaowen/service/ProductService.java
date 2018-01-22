package com.chaowen.service;

import com.chaowen.model.dto.ProductDTO;
import com.chaowen.model.vo.ProductVO;
import com.github.pagehelper.PageInfo;

public interface ProductService {
    /**
     * 新增产品
     * @param dto
     * @return
     */
    int add(ProductDTO dto);

    /**
     * 根据条件分页查询
     * @param dto
     * @return
     */
    PageInfo<ProductVO> queryByPage(ProductDTO dto);

    ProductVO queryById(ProductDTO dto);

    /**
     * 删除商品
     * @param dto
     * @return
     */
    int delete(ProductDTO dto);

    /**
     * 更新商品
     * @param dto
     * @return
     */
    int update(ProductDTO dto);
}
