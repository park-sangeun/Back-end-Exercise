package com.baby_ssu.controllerex.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
    @RequestMapping(value="/")
    public String hello(){
        return "hello";
    }
}
