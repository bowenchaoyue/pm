package com.chaowen.service;

import com.chaowen.model.dto.InfomationDTO;
import com.chaowen.model.vo.InfomationVO;
import com.github.pagehelper.PageInfo;

public interface InfomationService {
    /**
     * 新增资讯
     * @param infomationDTO
     * @return
     */
    int add(InfomationDTO infomationDTO);

    /**
     * 根据条件分页查询
     * @param dto
     * @return
     */
    PageInfo<InfomationVO> queryByPage(InfomationDTO dto);

    InfomationVO queryById(Long id);

    /**
     * 更新资讯
     * @param dto
     * @return
     */
    int update(InfomationDTO dto);

    /**
     * 删除资讯
     * @param dto
     * @return
     */
    int delete(InfomationDTO dto);
}
