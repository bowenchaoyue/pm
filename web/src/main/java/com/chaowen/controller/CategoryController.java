package com.chaowen.controller;


import com.chaowen.model.Category;
import com.chaowen.model.Result;
import com.chaowen.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    @RequestMapping("/getCategory")
    @ResponseBody
    public Result getCategory(){
        Category category = new Category();
        List<Category> categories = categoryService.queryByPage(category);
        return new Result(true,categories);
    }
}
