package com.sree.events.controller;

import com.sree.events.models.Product;
import com.sree.events.service.ReturnProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product/return")
public class ProductReturnController {
    @Autowired
    ReturnProductService returnProductService;

    @PostMapping("/process")
    public void returnProduct(@RequestBody Product product) {
        returnProductService.returnProduct(product.getProductId(), product.getProductName());
    }
}
