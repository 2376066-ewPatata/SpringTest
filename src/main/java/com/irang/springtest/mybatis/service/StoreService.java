package com.irang.springtest.mybatis.service;

import com.irang.springtest.mybatis.domain.Store;
import com.irang.springtest.mybatis.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public Store getStore(int id){
        // id가 3인 응답을 보내주자 ~

        Store store = storeRepository.selectStore(id);

        return store;
    }

}
