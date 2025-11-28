package com.irang.springtest.thymeleaf.service;

import com.irang.springtest.mvc.domain.Seller;
import com.irang.springtest.thymeleaf.domain.WeatherHistory;
import com.irang.springtest.thymeleaf.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    // 입력 받으면 맞는 날짜 가져오는 getter(반환값 가져오기)
        public WeatherHistory getDayWeather(int id){

            //WeatherHistory weatherHistory  = weatherRepository.selectDay(weatherHistory);


            return weatherHistory;
        }



}
