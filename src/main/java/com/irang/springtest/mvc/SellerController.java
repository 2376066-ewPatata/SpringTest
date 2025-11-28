package com.irang.springtest.mvc;

import com.irang.springtest.mvc.domain.Seller;
import com.irang.springtest.mvc.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/mvc/seller")
@Controller
public class SellerController {

    @Autowired
    private SellerService sellerService;


    @ResponseBody
    @PostMapping("/add")
    public String addSeller(
            @RequestParam("nickname") String nickname
            ,@RequestParam("profileImage") String profileImage
            ,@RequestParam("temperature") double temperature
    )
    {

        int count = sellerService.createSeller(nickname, profileImage, temperature);

        return "" + count;

    }


    @RequestMapping("/info")
    public String sellerInfo(
            Model model
            ,@RequestParam(value="id", required = false) Integer id
    ){

        Seller seller;

        if(id == null){
            seller = sellerService.getLastSeller();
        } else{
            seller = sellerService.getSellerId(id);
        }

        model.addAttribute("title", "판매자 정보");
        model.addAttribute("result", seller);

        return "mvc/sellerInfo";
    }




    @GetMapping("/form")
    public String sellerForm(){

        return "mvc/sellerForm";
    }

}
