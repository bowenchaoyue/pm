package com.chaowen.service;

import com.chaowen.model.Picture;
import com.github.pagehelper.PageInfo;

import java.util.List;


public interface PictureService {

    int add(Picture picture);

    int update(Picture picture);

    PageInfo<Picture> queryByPage(Picture picture);

    List<Picture> query(Picture picture);

    int delete(Picture picture);
}
