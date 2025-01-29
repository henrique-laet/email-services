package com.Laet.email_services.adapters;

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);
}
