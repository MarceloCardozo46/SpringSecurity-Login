package com.dailycodebuffer.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

    List<String> list = Arrays.asList("HOla", "Mundo");

    @GetMapping
    public List<String> getList(){
        return list;
    }



}
