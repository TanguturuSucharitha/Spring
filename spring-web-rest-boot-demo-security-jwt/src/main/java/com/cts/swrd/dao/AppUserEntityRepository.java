package com.cts.swrd.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.swrd.model.AppUserEntity;

@Repository
public interface AppUserEntityRepository extends CrudRepository<AppUserEntity, Integer> {
	
	AppUserEntity findByUsername(String username);
	boolean existsByUsername(String username);

}
