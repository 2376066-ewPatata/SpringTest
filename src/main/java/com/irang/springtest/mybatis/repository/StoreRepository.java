package com.irang.springtest.mybatis.repository;

import com.irang.springtest.mybatis.domain.Store;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//@Mapper
public interface StoreRepository {

    public Store selectStore(@Param("id") int id);

}
