package com.chaowen.service;

import com.chaowen.model.Result;
import com.chaowen.model.dto.MessageDTO;
import com.chaowen.model.vo.MessageVO;
import com.github.pagehelper.PageInfo;

public interface MessageService {

    Result add(MessageDTO dto);

    public PageInfo<MessageVO> queryByPage(MessageDTO dto);

    MessageVO queryById(MessageDTO dto);

    Result delete(MessageDTO dto);
}
