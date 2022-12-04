package com.syrobin.me.hybrid.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author syrobin
 * @version v1.0
 * @description:
 * @date 2022-12-04 20:12
 */
@RestController
@RequestMapping("/hybrid")
public class HybirdController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
