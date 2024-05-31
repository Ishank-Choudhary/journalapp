package net.engineeringDigest.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/health-check")
    public String healthcheck(){
        return "ok";
    }
    @GetMapping("/health-mapping")
    public String healthmap(){
        return "this is health mapping";
    }
}
