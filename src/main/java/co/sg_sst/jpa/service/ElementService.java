package co.sg_sst.jpa.service;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.sg_sst.jpa.model.ElementEntity;

public interface ElementService extends MongoRepository<ElementEntity, String>{
	
	//public ElementEntity findByName(String name);
	public List<ElementEntity> findByName(String name);


}
