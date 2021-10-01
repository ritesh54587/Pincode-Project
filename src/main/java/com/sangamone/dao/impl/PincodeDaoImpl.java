/**
 * 
 */
package com.sangamone.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sangamone.dao.PincodeDao;
import com.sangamone.entity.Pincode;
import com.sangamone.respository.PincodeRepo;
  @Service
@Transactional
public class PincodeDaoImpl implements PincodeDao {
	  @Autowired
	  PincodeRepo pincoderepo;
	  
	@Override
     public List<Pincode> get(String pincode) {
		List<Pincode> list = pincoderepo.getBypincodedetail(pincode);
	System.out.println("List: " + list);
       return list;
	}
	@Override
	public boolean save(Pincode pincode) {
		boolean flag = false;
		if(pincode !=null) {
			pincoderepo.save(pincode);
			flag = false;
			
		}
		return true;
		
	}

	}


	

