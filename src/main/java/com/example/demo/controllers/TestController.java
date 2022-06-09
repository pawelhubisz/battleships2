package com.example.demo.controllers;

import com.example.demo.model.Field;
import com.example.demo.service.FieldService;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final Gson gson = new Gson();

    private String toJson(Object object) {
        return gson.toJson(object);
    }

    private FieldService fieldService;

    public TestController(FieldService fieldService) {
        this.fieldService = fieldService;
    }

    @GetMapping("/test/field")
    public ResponseEntity saveField(Integer x, Integer y) {
        if (x == null || y == null) {
            return createResponseWithCode("One or more parameters are empty!", HttpStatus.BAD_REQUEST);
        }
        return createSuccessResponse(toJson(fieldService.saveFieldAndGetAll(new Field(x, y))));
    }


    private ResponseEntity createSuccessResponse(String body) {
        return createResponseWithCode(body, HttpStatus.OK);
    }

    private ResponseEntity createResponseWithCode(String body, HttpStatus status) {
        return new ResponseEntity(body, status);
    }
}
