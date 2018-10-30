package io.gdiazs.jee.web.home.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.transaction.Transactional;

import io.gdiazs.jee.web.home.models.ContactModel;

@Stateless
public class ContactServiceImpl implements ContactService {

	private List<ContactModel> contacts;

	
	public ContactServiceImpl() {
		super();
		this.contacts = new ArrayList<>();
	}

	
	/* (non-Javadoc)
	 * @see io.gdiazs.jee.web.home.services.ContactService#findAllContacts()
	 */
	@Override
	public List<ContactModel> findAllContacts(){
		return this.contacts;
	}
	
	/* (non-Javadoc)
	 * @see io.gdiazs.jee.web.home.services.ContactService#saveContact(io.gdiazs.jee.web.home.models.ContactModel)
	 */
	@Override
	@Transactional
	public void saveContact(ContactModel contact) {
		this.contacts.add(contact);
	}
}
