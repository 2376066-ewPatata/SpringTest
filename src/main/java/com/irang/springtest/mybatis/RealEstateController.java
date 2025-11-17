package com.irang.springtest.mybatis;

import com.irang.springtest.mybatis.domain.RealEstate;
import com.irang.springtest.mybatis.service.RealEstateService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/mybatis/real-estate")
@Controller
public class RealEstateController {

    @Autowired
    private RealEstateService realEstateService;

    @ResponseBody
    @RequestMapping("/2")
    public List<RealEstate> realEstate(@RequestParam("rent") int rentPrice){

        List<RealEstate> realEstate = realEstateService.getRealEstate(rentPrice);

        return realEstate;
    }

    @ResponseBody
    @RequestMapping("/3")
    public List<RealEstate> realEstate(@RequestParam("area") int area, @RequestParam("price") int price){

        List<RealEstate> realEstate = realEstateService.getRealEstate(area, price);

        return realEstate;
    }

    @ResponseBody
    @RequestMapping("/write/1")
    public String writeRealtor(){

        RealEstate realEstate = new RealEstate();
        realEstate.setRealtorId(3);
        realEstate.setAddress("푸르지용 리버 303동 1104호");
        realEstate.setArea(89);
        realEstate.setType("매매");
        realEstate.setPrice(100000);

        int count = realEstateService.getRealEstateByObject(realEstate);

        return "입력 성공 : " + count;
    }

    @ResponseBody
    @RequestMapping("/write/2")
    public String writeRealtor2(@RequestParam("realtorId") int realtorId){

        int count = realEstateService.getRealEstate2(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);

        return "입력 성공 : " + count;

    }

    @ResponseBody
    @RequestMapping("/update")
    public String updateRealEstate(
            @RequestParam("type") String type
            , @RequestParam("price") int price
    ){
        int count = realEstateService.getRealEstateForUpdate(type, price);

        return "수정 성공 : " + count;
    }

    @ResponseBody
    @RequestMapping("/delete")
    public String deleteRealEstate(@RequestParam("id") int id){

        int count = realEstateService.getRealEstateForDelete(id);

        return "삭제 성공 : " + count;
    }

 }
