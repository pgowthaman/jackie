package com.niit.kafonbackend.dao;

import com.niit.kafonbackend.model.Register;
import com.niit.kafonbackend.model.Supplier;

public interface RegisterDAO {
	public void addUser(Register reg);
	
	public Register getInfo(String lc);
	
	public Register getRegisterByUserId(String userId);
}
