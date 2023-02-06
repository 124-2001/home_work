package com.example.homework;

import com.example.homework.model.Account;
import com.example.homework.model.Wallet;
import com.example.homework.repository.AccountRepository;
import com.example.homework.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeWorkApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HomeWorkApplication.class, args);
    }

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    WalletRepository walletRepository;
    @Override
    public void run(String... args) throws Exception {
        /*Wallet wallet = new Wallet();
        wallet.setBalance(20000);
        walletRepository.save(wallet);

        Account account = new Account();
        account.setUserName("HoangNam");
        account.setPassword("12345");
        account.setIdWallet(wallet);
        accountRepository.save(account);

        Wallet wallet1 = new Wallet();
        wallet1.setBalance(30000);
        walletRepository.save(wallet1);

        Account account1 = new Account();
        account1.setUserName("HoangNam");
        account1.setPassword("12345");
        account1.setIdWallet(wallet1);
        accountRepository.save(account1);*/
    }
}
