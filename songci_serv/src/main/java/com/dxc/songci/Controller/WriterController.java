package com.dxc.songci.Controller;

import com.dxc.songci.model.TbWriter;
import com.dxc.songci.service.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Transactional
@RestController(value = "writer")
public class WriterController {

    @Autowired
    private WriterService writerService;

    @PostMapping(value = "/add")
    public boolean addWriter(@RequestBody TbWriter writer){
        writerService.addWriter(writer);
        return true;
    }
}
