package edu.mum.cs544.aop1.email;

public interface IEmailSender {
    void sendEmail(String email, String message);

    String getOutgoingMailServer();
}