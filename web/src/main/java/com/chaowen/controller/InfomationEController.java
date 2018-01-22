package com.chaowen.controller;

import com.chaowen.model.Result;
import com.chaowen.model.dto.InfomationDTO;
import com.chaowen.model.vo.InfomationVO;
import com.chaowen.service.InfomationService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/english/infomation")
public class InfomationEController extends BaseController{

    @Resource
    private InfomationService infomationService;

    @RequestMapping("/index")
    @ResponseBody
    public Result toInfomationIndex(InfomationDTO dto){
        dto.setLang(ENGLISH);
        PageInfo<InfomationVO> pageInfo = infomationService.queryByPage(dto);
        return new Result(true,pageInfo);
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public Result toInfomationList(@RequestBody InfomationDTO dto){
        dto.setLang(ENGLISH);
        PageInfo<InfomationVO> pageInfo = infomationService.queryByPage(dto);
        return new Result(true,pageInfo);
    }

    @RequestMapping("/detail")
    @ResponseBody
    public Result toInfomationDetail(Long id){
        InfomationVO infomationVO = infomationService.queryById(id);
        return new Result(true,infomationVO);
    }
}
