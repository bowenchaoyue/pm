package com.chaowen.service.impl;


import com.chaowen.dao.SeriesMapper;
import com.chaowen.model.Series;
import com.chaowen.service.SeriesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("seriesService")
public class SeriesServiceImpl implements SeriesService {

    @Resource
    private SeriesMapper seriesMapper;


    public int add(Series series) {
        return seriesMapper.add(series);
    }

    public List<Series> queryByPage(Series series) {
        return seriesMapper.queryByPage(series);
    }
}
