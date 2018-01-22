package com.chaowen.service;


import com.chaowen.model.Team;
import com.github.pagehelper.PageInfo;

public interface TeamService {
    /**
     * 新增成员
     * @param team
     * @return
     */
    int add(Team team);

    /**
     * 更新成员
     * @param team
     * @return
     */
    int update(Team team);

    /**
     * 删除成员
     * @param team
     * @return
     */
    int delete(Team team);

    /**
     * 根据条件分页查询
     * @param team
     * @return
     */
    PageInfo<Team> queryByPage(Team team);

}
