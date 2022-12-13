package com.api.api_user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HelloController {
    String nome = "usuario";

    @GetMapping(value = "Hello")
    public String Hello()
    {
        return "Olá grande " + nome + ", você está alterando uma api através de uma pipeline";
    }
    @GetMapping(value = "Testing")
    public String Testing()
    {
        return "A nova função foi implementada";
    }
}
