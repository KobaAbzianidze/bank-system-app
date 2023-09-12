package com.bank.banksystemapp.service;

import com.bank.banksystemapp.dto.BankResponse;
import com.bank.banksystemapp.dto.CreditDebitRequest;
import com.bank.banksystemapp.dto.EnquiryRequest;
import com.bank.banksystemapp.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
}
