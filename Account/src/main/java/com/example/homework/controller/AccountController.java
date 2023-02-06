package com.example.homework.controller;

import com.example.homework.model.Account;
import com.example.homework.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/account/get-all")
    public ResponseEntity<List<Account>> getAllAccount(){
        return ResponseEntity.ok(accountRepository.findAll());
    }
    @GetMapping("/account")
    public ResponseEntity<Account> getAccountById(@RequestParam int id){
        return ResponseEntity.ok(accountRepository.findById(id).get());
    }

    @PostMapping("account/update")
    public ResponseEntity<Account> updateAccount(@RequestBody Account accountUpdate){
        if(!accountRepository.findById(accountUpdate.getId()).isPresent()){
            Account account = new Account();
            account.setId(accountUpdate.getId());
            account.setUserName(accountUpdate.getUserName());
            account.setPassword(accountUpdate.getPassword());
            account.setIdWallet(accountUpdate.getIdWallet());
            accountRepository.save(account);
            return ResponseEntity.ok(account);
        }
        else {
            Account account = accountRepository.findById(accountUpdate.getId()).get();
            account.setId(accountUpdate.getId());
            account.setUserName(accountUpdate.getUserName());
            account.setPassword(accountUpdate.getPassword());
            account.setIdWallet(accountUpdate.getIdWallet());
            accountRepository.save(account);
            return ResponseEntity.ok(account);
        }
    }
}
