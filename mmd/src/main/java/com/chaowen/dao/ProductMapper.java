package com.chaowen.dao;


import com.chaowen.model.dto.ProductDTO;
import com.chaowen.model.vo.ProductVO;

import java.util.List;

public interface ProductMapper {
    /**
     * 新增商品
     * @param dto
     * @return
     */
    int add(ProductDTO dto);

    /**
     * 更新商品
     * @param dto
     * @return
     */
    int update(ProductDTO dto);

    ProductVO queryById(ProductDTO dto);

    /**
     * 根据条件进行分页查询
     * @param dto
     * @return
     */

    List<ProductVO> queryByPage(ProductDTO dto);

    /**
     * 删除商品
     * @param dto
     * @return
     */
    int delete(ProductDTO dto);
}
