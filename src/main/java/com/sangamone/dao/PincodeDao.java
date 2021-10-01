package com.sangamone.dao;

import java.util.List;

import com.sangamone.entity.Pincode;

public interface PincodeDao {

	public List<Pincode> get(String pincode);

	public boolean save(Pincode pincode);

}
