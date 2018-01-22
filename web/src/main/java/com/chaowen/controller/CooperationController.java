package com.chaowen.controller;


import com.chaowen.model.Cooperation;
import com.chaowen.model.Result;
import com.chaowen.service.CooperationService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RequestMapping("/cooperation")
@Controller
public class CooperationController extends BaseController{

    @Resource
    private CooperationService cooperationService;

    private Byte CHINESE = 0;

    @RequestMapping("/add.do")
    @ResponseBody
    public Result addCooperation(@RequestBody Cooperation cooperation, HttpServletRequest request){
        dealWithDTO(request,cooperation);
        cooperationService.add(cooperation);
        return new Result(true);
    }

    @RequestMapping("/update.do")
    @ResponseBody
    public Result updateCooperation(@RequestBody Cooperation cooperation,HttpServletRequest request){
        dealWithDTO(request,cooperation);
        cooperationService.update(cooperation);
        return new Result(true);
    }

    @RequestMapping("/delete.do")
    @ResponseBody
    public Result deleteCooperation(@RequestBody Cooperation cooperation,HttpServletRequest request){
        dealWithDTO(request,cooperation);
        cooperationService.delete(cooperation);
        return new Result(true);
    }

    @RequestMapping("/index")
    @ResponseBody
    public Result toCooperationIndex(Cooperation cooperation){
        cooperation.setLang(CHINESE);
        PageInfo<Cooperation> pageInfo = cooperationService.queryByPage(cooperation);
        return new Result(true,pageInfo);
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public Result toCooperationList(@RequestBody Cooperation cooperation){
        cooperation.setLang(CHINESE);
        PageInfo<Cooperation> pageInfo = cooperationService.queryByPage(cooperation);
        return new Result(true,pageInfo);
    }

    @RequestMapping("/detail")
    @ResponseBody
    public Result toCooperationDetail(Long id){
        Cooperation cooperation = new Cooperation();
        cooperation.setId(id);
        Cooperation query = cooperationService.queryById(cooperation);
        return  new Result(true,query);
    }
}
