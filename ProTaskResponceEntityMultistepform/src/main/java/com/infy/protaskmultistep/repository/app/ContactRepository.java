package com.infy.protaskmultistep.repository.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.protaskmultistep.model.app.AddressDetails;
@Repository
public interface ContactRepository extends CrudRepository<AddressDetails, Integer>{

}
