package com.xzh.generator.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.xzh.generator.mapper.UserMapper;
import com.xzh.generator.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 向振华
 * @date 2019/04/25 10:36
 */
@Controller
@RequestMapping
public class TestController {

    @Resource
    private UserMapper userMapper;

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        User user = userMapper.selectByPrimaryKey(69884L);
        return JSONUtils.toJSONString(user);
    }

}
