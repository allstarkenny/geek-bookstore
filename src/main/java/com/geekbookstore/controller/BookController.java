package com.geekbookstore.controller;

import com.geekbookstore.service.BookApiCallService;
import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

@Controller
public class BookController {
    @RequestMapping(value = "/test")
    public ResponseEntity test() throws Exception {
        return new ResponseEntity(new ArrayList<>(), HttpStatus.OK);
    }

    @RequestMapping(value = "/search")
    public ResponseEntity search() {
        BookApiCallService bookApiCallService = new BookApiCallService();
        JSONObject result = new JSONObject();
        try {
            result = bookApiCallService.get("https://openapi.naver.com/v1/search/book.json?query=%EC%A3%BC%EC%8B%9D&display=10&start=1");
        }catch (Exception e) {
            return new ResponseEntity(result, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
