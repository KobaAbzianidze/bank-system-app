package com.bank.banksystemapp.service;

import com.bank.banksystemapp.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
