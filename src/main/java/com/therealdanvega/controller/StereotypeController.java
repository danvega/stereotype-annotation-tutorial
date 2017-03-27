package com.therealdanvega.controller;

import com.therealdanvega.service.StereotypeService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StereotypeController {

    private StereotypeService stereotypeService;

    public StereotypeController(StereotypeService stereotypeService) {
        this.stereotypeService = stereotypeService;
    }

    @RequestMapping("/")
    public String home(){
        return stereotypeService.sayHello();
    }

    @RequestMapping("/list")
    public String list(){
        return "list";
    }

    @RequestMapping("/add")
    public String add(){
        return "add";
    }

    @RequestMapping("/save")
    public String save(){
        return "save";
    }

}
