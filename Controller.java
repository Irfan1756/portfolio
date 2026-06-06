package com.example.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class Controller {

    @Autowired
    private EmailService emailService;

    @GetMapping("/test")
    public String test() {
        return "Backend is working";
    }

    @PostMapping("/send-mail")
    public String sendMail(@ModelAttribute ContactForm form) {
        emailService.sendMail(
                form.getName(),
                form.getEmail(),
                form.getMessage()
        );
        return "Mail Sent Successfully!";
    }
}