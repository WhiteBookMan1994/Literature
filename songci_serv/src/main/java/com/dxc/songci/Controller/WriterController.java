package com.dxc.songci.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "writer")
public class WriterController {

    @PostMapping(value = "/add")
    public boolean addWriter(@RequestParam String name, @RequestParam String birthday){

        return true;
    }
}
