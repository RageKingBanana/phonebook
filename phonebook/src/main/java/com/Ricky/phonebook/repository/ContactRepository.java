package com.Ricky.phonebook.repository;

import com.Ricky.phonebook.model.Contact;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long>{
}
