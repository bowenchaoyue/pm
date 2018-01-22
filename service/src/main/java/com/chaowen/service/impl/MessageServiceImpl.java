package com.chaowen.service.impl;

import com.chaowen.dao.MessageMapper;
import com.chaowen.model.Result;
import com.chaowen.model.dto.MessageDTO;
import com.chaowen.model.vo.MessageVO;
import com.chaowen.service.MessageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("messageService")
public class MessageServiceImpl implements MessageService {

    @Resource
    private MessageMapper messageMapper;

    /**
     * 新增留言
     * @param dto
     * @return
     */
    public Result add(MessageDTO dto) {
        int result = messageMapper.add(dto);
        return new Result(true);
    }

    /**
     * 分页查询留言
     * @param dto
     * @return
     */
    public PageInfo<MessageVO> queryByPage(MessageDTO dto){
        //分页插件
        PageHelper.startPage(dto.getPageNum(),dto.getPageSize());
        //查询
        List<MessageVO> messageVOS = messageMapper.queryByPage(dto);
        //分页信息
        PageInfo<MessageVO> pageInfo = new PageInfo<MessageVO>(messageVOS);
        return pageInfo;
    }

    public MessageVO queryById(MessageDTO dto) {
        return messageMapper.queryById(dto);
    }

    public Result delete(MessageDTO dto) {
         messageMapper.delete(dto);
         return new Result(true);
    }
}
