package com.example.crypto_price_tracker.controler;

import com.example.crypto_price_tracker.service.CryptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CryptoController {

    @Autowired
    private CryptoService cryptoService;

    @GetMapping("/api/crypto")
    public List<Map<String, Object>> getAllCryptoPrices() { 
        return cryptoService.getAllCryptoPrices();
    }
}
