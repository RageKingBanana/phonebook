package com.Ricky.phonebook;

import com.Ricky.phonebook.model.Contact;
import com.Ricky.phonebook.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhonebookApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PhonebookApplication.class, args);
	}


	@Autowired
	private ContactService contactService;
	@Override
	public void run(String... args) throws Exception {


		contactService.save(new Contact(
				null,
				"Ricky",
				"09499227314",
				"mrjbperez@tip.edu.ph",
				true
		));
		contactService.save(new Contact(
				null,
				"Marc",
				"0995906235",
				"meamaz@tip.edu.ph",
				true
		));


	}
}
