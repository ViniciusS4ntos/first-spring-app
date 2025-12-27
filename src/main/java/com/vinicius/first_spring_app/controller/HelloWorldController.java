package com.vinicius.first_spring_app.controller;

import com.vinicius.first_spring_app.domain.User;
import com.vinicius.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world") // escuta as requisicoes de /hello-world
public class HelloWorldController {

    @Autowired // Indica que essa dependencia desse ser auto injetada
    private HelloWorldService helloWorldService;

    @GetMapping // GET /hello-world
    public String helloWorld(){
        return helloWorldService.helloWorld("Vinicius");
    }

    @PostMapping
    public String helloWorldPost(@RequestBody User body){
        return "Hello World " + body.getNome();
    }
}
