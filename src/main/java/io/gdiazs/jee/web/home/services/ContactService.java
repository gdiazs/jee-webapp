package io.gdiazs.jee.web.home.services;

import java.util.List;

import javax.ejb.Local;

import io.gdiazs.jee.web.home.models.ContactModel;

@Local
public interface ContactService {

	List<ContactModel> findAllContacts();

	void saveContact(ContactModel contact);

}