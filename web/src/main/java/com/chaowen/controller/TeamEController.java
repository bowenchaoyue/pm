package com.chaowen.controller;

import com.chaowen.model.Result;
import com.chaowen.model.Team;
import com.chaowen.service.TeamService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/english/team")
public class TeamEController extends BaseController {

    @Resource
    private TeamService teamService;

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public Result deleteTeam(@RequestBody Team team, HttpServletRequest request){
        team.setLang(ENGLISH);
        PageInfo<Team> pageInfo = teamService.queryByPage(team);
        return  new Result(true,pageInfo);
    }
}
