package ua.com.parad.service;

public interface MailSenderService {
	
	void sendEmail(String theme, String text, String email);

}
