package com.zhangtao.plant_conservation.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangtao
 * @date 2021-5-19
 */
@Slf4j
@RestController
@RequestMapping("/API")
public class TestController {

    @ResponseBody
    @PostMapping(value = "/test",produces = "application/json;charset=UTF-8")
    public String test() {
        return "hello";
    }
}
