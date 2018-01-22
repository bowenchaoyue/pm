package com.chaowen.service.impl;

import com.chaowen.dao.TeamMapper;
import com.chaowen.model.Team;
import com.chaowen.service.TeamService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("teamService")
public class TeamServiceImpl implements TeamService {

    @Resource
    private TeamMapper teamMapper;

    public int add(Team team) {
        return teamMapper.add(team);
    }

    public int update(Team team) {
        return teamMapper.update(team);
    }

    public int delete(Team team) {
        return teamMapper.delete(team);
    }

    public PageInfo<Team> queryByPage(Team team) {
        PageHelper.startPage(team.getPageNum(),team.getPageSize());
        List<Team> teams = teamMapper.queryByPage(team);
        PageInfo<Team> pageInfo = new PageInfo<Team>(teams);
        return pageInfo;
    }
}
