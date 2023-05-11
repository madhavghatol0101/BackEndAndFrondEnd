package com.infy.protaskmultistepform.controller.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.protaskmultistep.model.app.AddressDetails;
import com.infy.protaskmultistep.model.app.PersonalDetails;

import com.infy.protaskmultistepform.servicei.app.servicesi;
@CrossOrigin("*")
@RestController
public class Mycontroller {
	@Autowired
	servicesi si;
	
	@PostMapping(value = "/personal")
	public ResponseEntity<PersonalDetails> savepersonal(@RequestBody PersonalDetails sp){
		PersonalDetails per = si.personalsave(sp);
		return new ResponseEntity<PersonalDetails>(per,HttpStatus.CREATED);
	}	
	
	@PostMapping(value = "/contact")
	public ResponseEntity<AddressDetails> contactsave(@RequestBody AddressDetails sp){
		AddressDetails per = si.contactsave(sp);
		return new ResponseEntity<AddressDetails>(per,HttpStatus.CREATED);
	}	
	
	@GetMapping(value = "/personalsAll")
	public ResponseEntity<List<PersonalDetails>> getAll(){
		List<PersonalDetails> pers = si.getAll();
		return new ResponseEntity<List<PersonalDetails>>(pers,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deleteOne/{id}")
	public ResponseEntity<PersonalDetails> deleteOne(@PathVariable int id, @RequestBody PersonalDetails sp){
		si.deleteOne(sp);
		return new ResponseEntity<PersonalDetails>(sp,HttpStatus.NO_CONTENT);
	}
	@PutMapping(value = "/updateAll/{id}")
	public ResponseEntity<PersonalDetails> updateOne(@RequestBody PersonalDetails sp, @PathVariable int id)
	{
		si.personalsave(sp);
		return new ResponseEntity<PersonalDetails>(sp,HttpStatus.OK);
		
	}

}
