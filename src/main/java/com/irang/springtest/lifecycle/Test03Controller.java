package com.irang.springtest.lifecycle;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lifecycle/test03")
@Controller
public class Test03Controller {

    @RequestMapping("/1")
    public String thymeleaf() {

        return "lifecycle/test03";

    }





}
