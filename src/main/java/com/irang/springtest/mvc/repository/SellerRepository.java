package com.irang.springtest.mvc.repository;

import com.irang.springtest.mvc.domain.Seller;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SellerRepository {


    public int insertSeller(
            @Param("nickname") String nickname
            ,@Param("profileImage") String profileImage
            ,@Param("temperature") double temperature
    );

    public Seller selectLastSeller();

    public Seller selectSellerId(
            @Param("id") int id
    );
}
