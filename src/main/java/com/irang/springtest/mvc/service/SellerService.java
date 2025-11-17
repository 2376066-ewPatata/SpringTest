package com.irang.springtest.mvc.service;


import com.irang.springtest.mvc.domain.Seller;
import com.irang.springtest.mvc.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;


     public int createSeller(
             String nickname
             , String profileImage
             , double temperature
     ){

         int count = sellerRepository.insertSeller(nickname, profileImage, temperature);

         return count;

    }

    public Seller getLastSeller(){

         Seller seller = sellerRepository.selectLastSeller();

         return seller;
    }

    public Seller getSellerId(int id){
         Seller seller  = sellerRepository.selectSellerId(id);

         return seller;
    }

}
