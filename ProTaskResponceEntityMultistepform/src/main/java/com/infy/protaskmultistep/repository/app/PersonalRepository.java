package com.infy.protaskmultistep.repository.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.protaskmultistep.model.app.PersonalDetails;
@Repository
public interface PersonalRepository extends JpaRepository<PersonalDetails, Integer>{

}
