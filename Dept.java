package com.deloitte.dept.beans;

public class Dept {

	private static int DeptNo;
	private static String DName;
	private static String Loc;
	
	public Dept() {
		super();
	}
	public Dept(int deptNo, String dName, String loc) {
		super();
		DeptNo = deptNo;
		DName = dName;
		Loc = loc;
	}
	public static int getDeptNo() {
		return DeptNo;
	}
	public void setDeptNo(int deptNo) {
		DeptNo = deptNo;
	}
	public static String getDName() {
		return DName;
	}
	public void setDName(String dName) {
		DName = dName;
	}
	public static String getLoc() {
		return Loc;
	}
	public void setLoc(String loc) {
		Loc = loc;
	}
	
}
