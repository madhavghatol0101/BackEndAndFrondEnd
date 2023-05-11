package com.infy.protaskmultistep.serviceimpl.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.protaskmultistep.model.app.AddressDetails;
import com.infy.protaskmultistep.model.app.PersonalDetails;
import com.infy.protaskmultistep.repository.app.ContactRepository;
import com.infy.protaskmultistep.repository.app.EducationalRepository;
import com.infy.protaskmultistep.repository.app.PersonalRepository;

import com.infy.protaskmultistepform.servicei.app.servicesi;
@Service
public class serviceimpl implements servicesi{
	@Autowired
	PersonalRepository pr;  
	@Autowired
	ContactRepository cr;
	@Autowired
	EducationalRepository er;

	@Override
	public PersonalDetails personalsave(PersonalDetails sp) {
		PersonalDetails savep = pr.save(sp);
		return savep;
	}

	@Override
	public AddressDetails contactsave(AddressDetails cp) {
		AddressDetails savec = cr.save(cp);
		return savec;
	}

	@Override
	public List<PersonalDetails> getAll() {
		List<PersonalDetails> allinfo = pr.findAll();
		return allinfo;
	}

	@Override
	public void deleteOne(PersonalDetails sp) {
		
		pr.delete(sp);
		
	}

	
}
