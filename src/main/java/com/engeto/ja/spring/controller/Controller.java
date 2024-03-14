package com.engeto.ja.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.engeto.ja.spring.controller.FileHandling.loadFile;


@RestController
public class Controller {

    @GetMapping("scifi")
    public String scifi(){
        return loadFile("resources/scifi.txt");
    }

    @GetMapping("romantic")
    public String romantic(){
        return loadFile("resources/romantic.txt");
    }

    @GetMapping("historic")
    public String historic(){
        return loadFile("resources/historic.txt");
    }

}
