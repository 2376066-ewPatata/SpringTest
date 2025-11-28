package com.irang.springtest.database.service;


// Request, Response

import com.irang.springtest.database.domain.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//@Controller
public class StoreController {

    @Autowired
    private StoreService storeService;

    @ResponseBody
    @RequestMapping("/db/store/list")
    public List<Store> storeList(){

        // store 리스트 가져오기
        List<Store> storeList = storeService.getStoreList();
        return storeList;

    }






}
