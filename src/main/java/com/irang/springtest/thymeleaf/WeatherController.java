package com.irang.springtest.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/weather")
@Controller
public class WeatherController {

    @GetMapping("/weatherMain")
    public String weatherMain(){

        //db 가져와서 보여주기. 값 배열 형태로 리턴

        return "thymeleaf/weather/weatherMain";
    }

    @GetMapping("/weatherForm")
    public String weatherForm(){

        return "thymeleaf/weather/weatherForm";
    }

}
