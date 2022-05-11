package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.model.Registration;
import com.model.Login;
@Service
public class AppService {
	List<Registration> lst=new ArrayList<Registration>();
	public boolean loginValid(Login login) {
		for(Registration r:lst)
		if(login.getUserName().equals(r.getUserName()) && login.getPassword().equals(r.getPassword())) {
			return true;
		}
		return false;
	}
	public void addUser(Registration registration) {
		lst.add(registration);
		//System.out.println(registration.getPassword());
		System.out.println(lst);
	}
	public List<Registration> loadAll(){
		return lst;
	}
	public boolean findUser(String name) {
		for(Registration rs:lst) {
			if(rs.getUserName().equals(name)) {
				return true;
			}
		}
		return false;
	}
}