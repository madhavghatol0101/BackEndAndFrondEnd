package com.infy.protaskmultistep.model.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class EducationalDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String highest_qualification;
    private String university;
    private String total_marks;

}
