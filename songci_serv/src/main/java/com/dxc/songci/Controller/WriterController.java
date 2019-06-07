package com.dxc.songci.Controller;

import com.dxc.songci.model.TbWriter;
import com.dxc.songci.service.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@Transactional
@RestController
@RequestMapping("/writer")
public class WriterController {

    @Autowired
    private WriterService writerService;

    @PostMapping(value = "/add")
    public boolean addWriter(@RequestBody TbWriter writer) {
        writerService.addWriter(writer);
        return true;
    }

    /***
     * 根据作者姓名查询
     * @param name
     * @return
     */
    @GetMapping("/query")
    public TbWriter queryByWiterName(@RequestParam String name) {
       return writerService.queryByName(name);
    }
}
