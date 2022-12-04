package com.syrobin.me.hybrid.controller;

import org.graalvm.polyglot.Context;
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

    public static void main(String[] args) {
        // Java代码作为启动代码
        System.out.println("Hello GraalVM! from Java");
        System.out.println("Let's go with JavaScript");

        Context polyglot = Context.create();
        polyglot.eval("js", "print('Hello GraalVM! from JavaScript')");
    }
}
