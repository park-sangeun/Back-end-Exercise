package com.restAPI.restAPILogin.controller;

import com.restAPI.restAPILogin.service.firstService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class firstController {
    private final firstService firstService;

    @GetMapping("/first")
    public Map<String, Object> firstController() {
        return firstService.getFirstData();
    }
}
