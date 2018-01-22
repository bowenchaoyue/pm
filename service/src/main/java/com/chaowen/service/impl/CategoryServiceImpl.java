package com.chaowen.service.impl;


import com.chaowen.dao.CategoryMapper;
import com.chaowen.model.Category;
import com.chaowen.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    public int add(Category category) {
        return categoryMapper.add(category);
    }

    public List<Category> queryByPage(Category category) {
        return categoryMapper.queryByPage(category);
    }
}
