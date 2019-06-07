package com.dxc.songci.service;

import com.dxc.songci.model.TbWriter;

public interface WriterService {
    /**
     * 添加词人
     *
     * @param tbWriter
     * @return
     */
    int addWriter(TbWriter tbWriter);

    /**
     * 根据名称查找词人
     *
     * @param name
     * @return
     * */
    TbWriter queryByName(String name);
}
