package com.chaowen.service;


import com.chaowen.model.Series;

import java.util.List;

public interface SeriesService {
    /**
     * 新增系列
     * @return
     */
    int add(Series series);

    /**
     * 查询系列
     * @return
     */
    List<Series> queryByPage(Series series);

}
