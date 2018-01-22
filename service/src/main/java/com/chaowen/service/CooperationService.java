package com.chaowen.service;


import com.chaowen.model.Cooperation;
import com.github.pagehelper.PageInfo;

public interface CooperationService {
    /**
     * 新增合作伙伴
     * @param cooperation
     * @return
     */
    int add(Cooperation cooperation);

    /**
     * 更新合作伙伴
     * @param cooperation
     * @return
     */
    int update(Cooperation cooperation);

    /**
     * 删除合作伙伴
     * @param cooperation
     * @return
     */
    int delete(Cooperation cooperation);

    /**
     * 分页查询
     * @param cooperation
     * @return
     */
    PageInfo<Cooperation> queryByPage(Cooperation cooperation);

    Cooperation queryById(Cooperation cooperation);
}
