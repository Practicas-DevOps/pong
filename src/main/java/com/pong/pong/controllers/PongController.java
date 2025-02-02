package com.pong.pong.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/pong")
public class PongController {
    @GetMapping
    public Mono<String> pong(){
        return Mono.just("Pong");
    }
}

