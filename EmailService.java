package com.example.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service

public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(String name, String email, String message) {

        SimpleMailMessage mail = new SimpleMailMessage();

        mail.setTo("irfanshaik1706@gmail.com"); // receiver
        mail.setSubject("Portfolio Contact Form Message");

        mail.setText(
                "Name: " + name + "\n" +
                        "Email: " + email + "\n\n" +
                        "Message: " + message
        );

        mailSender.send(mail);
    }
}
