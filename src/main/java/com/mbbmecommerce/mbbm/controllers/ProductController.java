package com.mbbmecommerce.mbbm.controllers;

import jakarta.xml.ws.http.HTTPBinding;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/products/")
public class ProductController {

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getProduct(@PathVariable String productId){
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
