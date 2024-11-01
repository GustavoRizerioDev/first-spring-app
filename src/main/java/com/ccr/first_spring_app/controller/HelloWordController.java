package com.ccr.first_spring_app.controller;

import com.ccr.first_spring_app.domain.User;
import com.ccr.first_spring_app.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWordController {

    @Autowired
    private HelloWordService helloWordService;

    @GetMapping
    public String helloWord(){
        return helloWordService.helloWorld("Gustta");
    }

    @PostMapping("/{id}")
    public String helloWordPost(
            @PathVariable("id") String id,
            @RequestParam(value = "filter", defaultValue = "nenhum") String filter,
            @RequestBody User body)
    {
        return "Hello World " + filter;
    }
    @DeleteMapping
    public String helloWordDelete(){
        return "Deletado com sucesso";
    }

}
