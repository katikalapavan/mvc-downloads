package com.model;

import java.util.ArrayList;
import java.util.List;

public class Employees {
	
	private List<Employee> emplist;
	
	public List<Employee> getEmplist(){
		
		if(emplist==null) {
			emplist=new ArrayList<Employee>();
		}
		return emplist;
	}
   public void setEmpList(List<Employee> emplist) {
	   this.emplist=emplist;
   }

}
