package com.example.crypto_price_tracker.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CryptoService {

    private final String API_URL = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd"; // Ny URL för alla mynt

    public List<Map<String, Object>> getAllCryptoPrices() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL, List.class); // Returnera en lista av kryptovalutor
    }
}
