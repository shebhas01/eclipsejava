package com.costructoroverloading;



public class CostructorOverloadingDemo {

	public static void main(String[] args) {

		Student s=new Student();
		System.out.println("\nDefault costructor value:\n");
		System.out.println("Student id:"+s.id+"\nStudent Name:"+s.name);
		 
		
		System.out.println("\nparameterized constructor values:\n");
		 Student student=new Student(1,"Swetha");
		 System.out.println("Student id:"+student.id+"\nStudent Name:"+student.name);


			}




	}

