package com.irang.springtest.mvc.repository;

import com.irang.springtest.mvc.domain.Realtor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RealtorRepository {

    public int insertRealtorByObject(Realtor realtor);
}
