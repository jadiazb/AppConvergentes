package co.sg_sst.jpa.service;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.sg_sst.jpa.model.UserEntity;

public interface UserService extends MongoRepository<UserEntity, String> {

	public List<UserEntity> findByName(String name);

	//public List<UserEntity> findByUserName(String username);

}
