package com.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int cid;
	private String ename;
	private int sal;
	private int deptno;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public Employee(int cid, String ename, int sal, int deptno) {
		super();
		this.cid = cid;
		this.ename = ename;
		this.sal = sal;
		this.deptno = deptno;
	}
	public Employee()
	{
		
	}
	
	
}
