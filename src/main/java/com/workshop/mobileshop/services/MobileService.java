package com.workshop.mobileshop.services;

import com.workshop.mobileshop.module.Mobile;
import com.workshop.mobileshop.repo.MobileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileService {

    @Autowired
    MobileRepo mobileRepo; //MobileRepo interface

    public List<Mobile> getAll(){

        return mobileRepo.findAll();
    }


}
