package com.chaowen.service.impl;


import com.chaowen.dao.DictionaryMapper;
import com.chaowen.model.Dictionary;
import com.chaowen.service.DictionaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("dictionaryService")
public class DictionaryImpl implements DictionaryService {

    @Resource
    private DictionaryMapper dictionaryMapper;

    public int add(Dictionary dictionary) {
        return dictionaryMapper.add(dictionary);
    }

    public List<Dictionary> queryByKey(Dictionary dictionary) {
        return dictionaryMapper.queryByKey(dictionary);
    }

    public int update(Dictionary dictionary) {
        return dictionaryMapper.update(dictionary);
    }

    public int delete(Dictionary dictionary) {
        return dictionaryMapper.delete(dictionary);
    }
}
