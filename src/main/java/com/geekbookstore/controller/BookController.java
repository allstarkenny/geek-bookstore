package com.geekbookstore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

@Controller
public class BookController {

    @RequestMapping(value = "/test")
    public ResponseEntity test(){
        return new ResponseEntity(new ArrayList<>(), HttpStatus.OK);
    }
}
