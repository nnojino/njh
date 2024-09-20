package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "TestApi", description = "swagger test api")
@RequestMapping("/")
public class TestController {

    @Operation(summary = "string", description = "parameter")
    @Parameter(name ="str", description = "test string")
    @GetMapping("/returnString")
    public String returnString(@RequestParam String str) {
        return str.concat("\n").concat(str);
    }
}
