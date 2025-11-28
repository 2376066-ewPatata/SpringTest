package com.irang.springtest.database.service;


import com.irang.springtest.database.domain.Store;
import com.irang.springtest.database.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class StoreService {


    @Autowired
    private StoreRepository storeRepository;


    public List<Store> getStoreList(){

        List<Store> storeList = storeRepository.selectStoreList();

        return storeList;

    }



}
