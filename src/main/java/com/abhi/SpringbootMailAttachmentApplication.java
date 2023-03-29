package com.abhi;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.abhi.service.EmailSenderService;

@SpringBootApplication
public class SpringbootMailAttachmentApplication {

	@Autowired
	private EmailSenderService emailSenderervice;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMailAttachmentApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException 
	{
		emailSenderervice.sendMailWithAttachment("abhishekgoswami746@gmail.com","Hi,Please find my resume as an attachment.","JAVA DEVELOPER RESUME -ABHISHEK GOSWAMI","D:\\email\\Abhishek resume.pdf");

	}

}
