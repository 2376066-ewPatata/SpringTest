package com.irang.springtest.mybatis.service;

import com.irang.springtest.mybatis.domain.RealEstate;
import com.irang.springtest.mybatis.repository.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealEstateService {

    @Autowired
    private RealEstateRepository realEstateRepository;

    public List<RealEstate> getRealEstate(int rentPrice){

       List<RealEstate> realEstate = realEstateRepository.selectRealEstate(rentPrice);

       return realEstate;

    }

    public List<RealEstate> getRealEstate(int area, int price) {

        List<RealEstate> realEstate = realEstateRepository.selectRealEstate(area, price);

        return realEstate;

    }

    public int getRealEstateByObject(RealEstate realEstate){
        int count = realEstateRepository.insertRealEstateByObject(realEstate);

        return count;
    }

    public int getRealEstate2(
            int realtorId
            , String address
            , int area
            , String type
            , int price
            , int rentPrice
    ){
       int count = realEstateRepository.insertRealEstate(realtorId, address, area, type, price, rentPrice);

       return count;
    }

    public int getRealEstateForUpdate(
            String type
            , int price
    ){
        int count = realEstateRepository.updateRealEstate(type, price);

        return count;
    }

    public int getRealEstateForDelete(int id){
        int count = realEstateRepository.deleteRealEstate(id);

        return count;
    }

}
