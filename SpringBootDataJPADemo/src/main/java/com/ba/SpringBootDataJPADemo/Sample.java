package com.ba.SpringBootDataJPADemo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "Employee")
public class Sample {
	
	private String F_name;

	public String getF_name() {
		return F_name;
	}

	public void setF_name(String f_name) {
		F_name = f_name;
	}

}
