package com.infy.protaskmultistep.repository.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.protaskmultistep.model.app.EducationalDetails;
@Repository
public interface EducationalRepository extends CrudRepository<EducationalDetails, Integer>{

}
