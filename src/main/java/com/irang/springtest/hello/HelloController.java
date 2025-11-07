package com.irang.springtest.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
        public String helloWorld(){
            return "HelloWorld!";
        }

}
