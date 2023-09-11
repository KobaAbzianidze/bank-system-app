package com.bank.banksystemapp.service;

import com.bank.banksystemapp.dto.BankResponse;
import com.bank.banksystemapp.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
