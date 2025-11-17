package com.irang.springtest.mvc.service;

import com.irang.springtest.mvc.domain.Realtor;
import com.irang.springtest.mvc.repository.RealtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealtorService {

    @Autowired
    private RealtorRepository realtorRepository;

    public int createRealtorByObject(Realtor realtor){

        int count = realtorRepository.insertRealtorByObject(realtor);

        return count;
    }
}
