package com.irang.springtest.mybatis.repository;

import com.irang.springtest.mybatis.domain.RealEstate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface RealEstateRepository {

    public List<RealEstate> selectRealEstate(@Param("rent_price") int rentPrice);

    public List<RealEstate> selectRealEstate(@Param("area") int area, @Param("price") int price);

    // 오버로딩은 잘하지않음. 별도의 메서드를 만드는 것을 추천


    public int insertRealEstateByObject(RealEstate realEstate);

    public int insertRealEstate(
            @Param("realtorId") int realtorId
            ,@Param("address") String address
            ,@Param("area") int area
            ,@Param("type") String type
            ,@Param("price") int price
            ,@Param("rentPrice") int rentPrice
            );

    public int updateRealEstate(
            @Param("type") String type
            , @Param("price") int price
    );

    public int deleteRealEstate(@Param("id") int id);


}
