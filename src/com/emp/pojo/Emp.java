package com.emp.pojo;

import java.util.Date;

public class Emp {
	
	private int empno;//编号;
	private String name;//姓名;
	private Date hiredate;//日期;
	private int sal;//薪水;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", hiredate=" + hiredate + ", sal=" + sal + "]";
	}
	public Emp() {
		super();
	}
	public Emp(String name, Date hiredate, int sal) {
		super();
		this.name = name;
		this.hiredate = hiredate;
		this.sal = sal;
	}
	public Emp(int empno, String name, Date hiredate, int sal) {
		super();
		this.empno = empno;
		this.name = name;
		this.hiredate = hiredate;
		this.sal = sal;
	}
	
}
