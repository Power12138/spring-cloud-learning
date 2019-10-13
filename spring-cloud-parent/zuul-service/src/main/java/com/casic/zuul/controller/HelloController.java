package com.casic.zuul.controller;
/*
 *Created with IntelliJ IDEA
 *User: tangcb
 *Date: 2019/10/13
 *Time: 18:17
 *Description:
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String say() {
        return "say hello";
    }

}
