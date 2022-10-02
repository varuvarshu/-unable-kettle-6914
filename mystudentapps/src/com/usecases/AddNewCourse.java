package com.usecases;

import java.util.Scanner;

import com.bean.Course;
import com.dao.StudentDao;
import com.dao.StudentDaoImpl;

public class AddNewCourse {
	public static void add() {
		
//		here we added the new course
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter coure details");
		System.out.println("Enter course name : ");
		String cname=sc.next();
		System.out.println("Enter fees of course : ");
		int fee=sc.nextInt();
		System.out.println("Enter batch id");
		int bid=sc.nextInt();
		Course c=new Course();
		c.setCname(cname);
		c.setFee(fee);
		c.setBid(bid);
		StudentDao dao=new StudentDaoImpl();
		String result= dao.addNewCourse(c);
		System.out.println(result);
	}
	
}
