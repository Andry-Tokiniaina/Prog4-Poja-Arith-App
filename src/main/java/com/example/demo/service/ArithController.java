package com.example.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ArithController {
    private ArithService service;

    @GetMapping("/add")
    public double add(int a, int b){
        return service.add(a, b);
    }

    @GetMapping("/substrate")
    public  double subtract(int a, int b){
        return  service.subtract(a, b);
    }

    @GetMapping("/multiply")
    public  double multiply(int a, int b){
        return  service.multiply(a, b);
    }

    @GetMapping("/divide")
    public  double divide(int a, int b){
        return  service.divide(a, b);
    }
}
