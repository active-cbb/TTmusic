package com.abin.musicservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CXB
 * @version 1.0.0
 * @ClassName DefaultController.java
 * @Description TODO
 * @createTime 2022年02月26日 08:15:00
 */
@RestController
public class DefaultController {


    @GetMapping("/")
    public String me(){
        return "hell";
    }

}
