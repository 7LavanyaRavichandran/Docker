package com.SpringBoot.Docker.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/docker")
    public String DockerTest(){
        return "Docterization of SpringBoot";
    }

}
