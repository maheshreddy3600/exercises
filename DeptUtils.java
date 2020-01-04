package com.deloitte.dept.utils;

public class DeptUtils {
public static String insertqry="insert into dept values(?,?,?)";
public static final String GETDEPTS = "select * from dept";
public static final String GETDEPTBYCODE = "select * from emp where deptno=?";
public static  String updateqry="update dept set dname=? where deptno=?";
public static String deleteqry="delete  from dept where deptno=?";
public static String CompleteUpdationQuery="update dept set dname=?, loc=? ,deptno=? where deptno=?";
}