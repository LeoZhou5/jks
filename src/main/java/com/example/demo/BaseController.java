package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Leo on 2018/9/29.
 */
@RestController
public class BaseController {
    @GetMapping("jenkins")
    public String hi(){
        return "Hello Jenkins";
    }

    @GetMapping("reply")
    public String reply(){
        return "Run And Run";
    }

    @GetMapping("first")
    public String firstUpload(){
        return "First Upload";
    }
}
