package com.example.receiver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/")
public class ReceiverController {

    @GetMapping
    public String[] getMapping(@RequestParam(value = "reqParam[]") String[] reqParam){
        System.out.println("this is a hit");
        Arrays.stream(reqParam).forEach(System.out::println);
        return reqParam;
    }
}
