package com.Laet.email_services.application;

import com.Laet.email_services.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }


    @Override
    public void sendEmail(String to, String subject, String body) {

    }
}
