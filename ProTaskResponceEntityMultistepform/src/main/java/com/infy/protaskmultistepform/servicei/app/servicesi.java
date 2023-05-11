package com.infy.protaskmultistepform.servicei.app;

import java.util.List;

import com.infy.protaskmultistep.model.app.AddressDetails;
import com.infy.protaskmultistep.model.app.PersonalDetails;


public interface servicesi {

	public PersonalDetails personalsave(PersonalDetails sp);

	public AddressDetails contactsave(AddressDetails cp);

	public List<PersonalDetails> getAll();

	public void deleteOne(PersonalDetails sp);



}
