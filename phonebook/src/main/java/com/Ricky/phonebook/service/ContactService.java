package com.Ricky.phonebook.service;

import com.Ricky.phonebook.model.Contact;
import com.Ricky.phonebook.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte1.other;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> fetchAll() {
        return contactRepository.findAll();
    }

    public Contact find(Long id) throws Exception {
        Contact contact = contactRepository.findById(id).orElse(null);
        if (contact == null) throw new Exception("Contact id doesn't exit");
        return contact;
    }

    public Contact save(Contact contact) throws Exception {

        try {

            return contactRepository.saveAndFlush(contact);
        } catch (Exception exception) {
            Throwable t = exception.getCause();
            while (t.getCause() != null) t = t.getCause();
            throw new Exception(t.getLocalizedMessage());
        }

    }

    public Contact update(Contact contact) throws Exception {

        try {

            return contactRepository.save(contact);
        } catch (Exception exception) {
            Throwable t = exception.getCause();
            while (t.getCause() != null) t = t.getCause();
            throw new Exception(t.getLocalizedMessage());
        }

    }

    public void delete(Long id) throws Exception {
        try {
            Contact contact = this.find(id);
            contactRepository.delete(contact);
        } catch (Exception exception) {
            Throwable t = exception.getCause();
            while (t.getCause() != null) t = t.getCause();
            throw new Exception(t.getLocalizedMessage());
        }
    }


}

