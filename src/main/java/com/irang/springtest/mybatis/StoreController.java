package com.irang.springtest.mybatis;

import com.irang.springtest.mybatis.domain.Store;
import com.irang.springtest.mybatis.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
public class StoreController {

    @Autowired
    private StoreService storeService;

    @ResponseBody
    @RequestMapping("/mybatis/store")
    public Store store(@RequestParam("id") int id){

        // id 3인 응답을 가져오자~
        Store store = storeService.getStore(id);

        return store;

    }

}
