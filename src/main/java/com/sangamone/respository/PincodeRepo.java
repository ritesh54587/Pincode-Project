package com.sangamone.respository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sangamone.entity.Pincode;

public interface PincodeRepo extends CrudRepository<Pincode, Integer> {
	
	@Query(value = "select * from pincode where pincode=?1", nativeQuery = true)
	List<Pincode> getBypincodedetail(String pincode);

}
