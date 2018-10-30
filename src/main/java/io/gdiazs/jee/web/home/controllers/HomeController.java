package io.gdiazs.jee.web.home.controllers;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.gdiazs.jee.web.home.models.ContactModel;
import io.gdiazs.jee.web.home.services.ContactService;

@Named("home")
@RequestScoped
public class HomeController {

	private ContactModel contactModel;
	
	private List<ContactModel> contacts;

	@Inject
	private ContactService contactService;

	public HomeController() {
		this.contactModel = new ContactModel();
	}

	public ContactModel getContactModel() {
		return contactModel;
	}

	public void setContactModel(ContactModel contactModel) {
		this.contactModel = contactModel;
	}
	
	public List<ContactModel> getContacts() {
		return contacts;
	}

	public void setContacts(List<ContactModel> contacts) {
		this.contacts = contacts;
	}
	
	public void setContactService(ContactService contactService) {
		this.contactService = contactService;
	}

	public void saveContactData() {
		this.contactService.saveContact(contactModel);
		this.contacts = this.contactService.findAllContacts();
	}
}
