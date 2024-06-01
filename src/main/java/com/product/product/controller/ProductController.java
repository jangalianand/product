package com.product.product.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @GetMapping("/greeting")
    public String sayHello(){
        return "welcome to spring boot 3 app";
    }

}

//8080
//http://localhost:9090/api/product/greeting


