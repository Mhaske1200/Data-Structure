package Question_02;

import java.util.Comparator;

public class Emp 
{
	int empid ;
	String name;
	double sal;
	int deptno;
	
	Emp()
	{
		empid = 0;
		name = "NA";
		sal = 0.000;
		deptno = 0;
	}
	Emp(int empid , String name , double sal , int deptno)
	{
		this.empid = empid;
		this.name = name;
		this.sal = sal;
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "\n Emp [empid=" + empid + ", name=" + name + ", sal=" + sal + ", deptno=" + deptno + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	
}
