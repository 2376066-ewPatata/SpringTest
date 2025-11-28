package com.irang.springtest.mvc;


import com.irang.springtest.mvc.domain.Realtor;
import com.irang.springtest.mvc.service.RealtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/mvc/realtor")
@Controller
public class RealtorController {

    @Autowired
    private RealtorService realtorService;

    @GetMapping("/add")
    public String addRealator(
            @RequestParam("office") String office
            ,@RequestParam("phoneNumber") String phoneNumber
            ,@RequestParam("address") String address
            ,@RequestParam("grade") String grade
            , Model model){

        Realtor realtor = new Realtor();
        realtor.setOffice(office);
        realtor.setPhoneNumber(phoneNumber);
        realtor.setAddress(address);
        realtor.setGrade(grade);

        realtorService.createRealtorByObject(realtor);

        model.addAttribute("newRealtor", realtor);

        return "mvc/realtorInfo";

    }



    @GetMapping("/form")
    public String userForm(){

        return "mvc/realtorForm";
    }


}
