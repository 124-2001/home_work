package com.example.homework.controller;

import com.example.homework.model.Account;
import com.example.homework.model.Wallet;
import com.example.homework.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WalletController {
    @Autowired
    WalletRepository walletRepository;

    @GetMapping("/wallet/get-all")
    public ResponseEntity<List<Wallet>> getAllWallet(){
        return ResponseEntity.ok(walletRepository.findAll());
    }

    @GetMapping("/wallet")
    public ResponseEntity<Wallet> getWalletByBalance(@RequestParam float balance){
        return ResponseEntity.ok(walletRepository.findByBalance(balance).get());
    }
}
