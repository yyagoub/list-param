package com.example.sender.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class SenderController {

    final private RestTemplate restTemplate;

    @GetMapping
    public String[] getMapping(){
        final String[] params = {"yousef", "mostafa", "someone", "somebody"};
        final String uri = "http://localhost:8880/";
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(uri)
                .queryParam("reqParam[]", params);
        String[] result = restTemplate.getForObject(builder.build().encode().toUri(),String[].class);
        // Arrays.stream(result).forEach(System.out::println);
        return result;
    }
}
