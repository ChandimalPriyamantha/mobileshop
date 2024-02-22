package com.workshop.mobileshop.controller;

import com.workshop.mobileshop.module.Mobile;
import com.workshop.mobileshop.services.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/")
public class MobileController {

    @Autowired
    MobileService mobileService;


    @GetMapping("/mobile")
    public List<Mobile> getAll(){

       return  null;
   }




}
