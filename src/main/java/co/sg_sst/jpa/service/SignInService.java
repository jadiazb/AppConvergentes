package co.sg_sst.jpa.service;

//import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.sg_sst.jpa.model.SignInEntity;

public interface SignInService extends MongoRepository<SignInEntity, String>{
	
	public SignInEntity findByEmail(String email);


}
