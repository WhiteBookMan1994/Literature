package com.dxc.songci.service.impl;

import com.dxc.songci.model.TbWriter;
import com.dxc.songci.model.mapper.TbWriterMapper;
import com.dxc.songci.service.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WriterServiceImpl implements WriterService{

    @Autowired
    private TbWriterMapper tbWriterMapper;

    @Override
    public int addWriter(TbWriter tbWriter) {
        return tbWriterMapper.insertSelective(tbWriter);
    }
}
