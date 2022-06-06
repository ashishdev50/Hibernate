package com.Google;

import  javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class empolyee {
@Id
	int eid;
	String ename;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "empolyee [eid=" + eid + ", ename=" + ename + "]";
	}
 
	
	
	
	
}
