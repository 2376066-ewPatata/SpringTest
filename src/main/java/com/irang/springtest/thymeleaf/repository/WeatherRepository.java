package com.irang.springtest.thymeleaf.repository;


import com.irang.springtest.thymeleaf.domain.WeatherHistory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WeatherRepository {

    //select로 db접근하여 가져온다.
    public WeatherHistory selectDay(WeatherHistory weatherHistory);

}
