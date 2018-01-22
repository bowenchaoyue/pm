package com.chaowen.service.impl;

import com.chaowen.dao.PictureMapper;
import com.chaowen.model.Picture;
import com.chaowen.service.PictureService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("pictureService")
public class PictureServiceImpl implements PictureService {


    @Resource
    private PictureMapper pictureMapper;

    public int add(Picture picture) {
        return pictureMapper.add(picture);
    }

    public int update(Picture picture) {
        return pictureMapper.update(picture);
    }

    public PageInfo<Picture> queryByPage(Picture picture) {
        PageHelper.startPage(picture.getPageNum(),picture.getPageSize());
        List<Picture> pictures = pictureMapper.queryByPage(picture);
        PageInfo<Picture> pageInfo = new PageInfo<Picture>(pictures);
        return pageInfo;
    }

    public List<Picture> query(Picture picture) {
        return pictureMapper.queryByPage(picture);
    }

    public int delete(Picture picture) {
        return pictureMapper.delete(picture);
    }
}
