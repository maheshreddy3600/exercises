package com.deloitte.dept.dao;

import java.util.List;

import com.deloitte.dept.beans.Dept;

public interface DeptDao {
void openConnection() ;
void close();
int addDept(Dept dept);
List<Dept> getDepts();
Dept getDeptByCode(int deptcode);

int updateDept(int deptno, String dname);
int deletion(int deptno);
int updateCompletedept(int deptno,String dname,String loc);
}