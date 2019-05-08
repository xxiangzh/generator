package com.xzh.generator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 向振华
 * @date 2019/04/25 10:36
 */
@Controller
@RequestMapping
public class TestController {

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "success";
    }

}
