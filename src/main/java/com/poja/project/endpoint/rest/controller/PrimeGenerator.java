package com.poja.project.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.security.SecureRandom;

@RestController
public class PrimeGenerator {
    @GetMapping("/new-prime")
    public BigInteger primeGenerator(){
        return BigInteger.probablePrime(10000, new SecureRandom());
    }
}
