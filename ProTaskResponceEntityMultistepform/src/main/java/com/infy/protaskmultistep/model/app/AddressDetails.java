package com.infy.protaskmultistep.model.app;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class AddressDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String city;
    private String address;
    private String pincode;
    @OneToOne(cascade = CascadeType.ALL)
    EducationalDetails ed;

}
