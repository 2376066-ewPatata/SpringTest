package com.irang.springtest.database.repository;

import com.irang.springtest.database.domain.Store;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface StoreRepository {

    public List<Store> selectStoreList();

}
