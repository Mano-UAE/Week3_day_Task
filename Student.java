package org.student;

import org.department.Department;

public class Student extends Department
{
public void studentName()
{
	System.out.println("Mano");
}
public void studentDept()
{
	System.out.println("IT A");
}
public void studentId()
{
	System.out.println("5");
}
public static void main(String[] args)
{
	Student St=new Student();
	St.studentName();
	St.studentDept();
	St.studentId();
	St.deptName();
	St.collegeName();
	St.collegeCode();
	St.collegeRank();
}
}
