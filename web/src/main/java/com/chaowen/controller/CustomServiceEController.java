package com.chaowen.controller;


import com.chaowen.model.Dictionary;
import com.chaowen.model.Result;
import com.chaowen.service.DictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/english/custom")
public class CustomServiceEController {

    @Resource
    private DictionaryService dictionaryService;

    @RequestMapping("/philosophy")
    @ResponseBody
    public Result toPhilosophyPage(){
        Dictionary dic = new Dictionary();
        dic.setKey("philosophy");
        List<Dictionary> dictionaries = dictionaryService.queryByKey(dic);
        return new Result(true,dictionaries.get(0));
    }

    @RequestMapping("/net")
    @ResponseBody
    public Result toNetPage(){
        Dictionary dic = new Dictionary();
        dic.setKey("net");
        List<Dictionary> dictionaries = dictionaryService.queryByKey(dic);
        return new Result(true,dictionaries.get(0));
    }

}
