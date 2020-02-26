package com.example.web;

import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("{id}")
    @RequestMapping("/hello")
    public User getUser(@PathVariable(name = "id")Integer id){
        return restTemplate.getForObject("http://localhost/user/1", User.class);
    }
}
