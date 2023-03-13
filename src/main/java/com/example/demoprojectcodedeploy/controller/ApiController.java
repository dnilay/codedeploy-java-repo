package com.example.demoprojectcodedeploy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api/health")
    public ResponseEntity<?> healthCheck()
    {
        return ResponseEntity.ok("it worked successfully...");
    }
}