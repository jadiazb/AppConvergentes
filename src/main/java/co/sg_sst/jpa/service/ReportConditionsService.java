package co.sg_sst.jpa.service;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.sg_sst.jpa.model.ReportConditionsEntity;

public interface ReportConditionsService extends MongoRepository<ReportConditionsEntity, String>{
	
	//public ElementEntity findByName(String name);
	public List<ReportConditionsEntity> findByCondition(String condition);


}
