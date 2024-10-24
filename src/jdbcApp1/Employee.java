package jdbcApp1;

import java.util.Scanner;

public class Employee {
	private int eid;
	private String ename;
	private int esal;
	private String deg;
	Employee(int eid,String ename,int sal){
		this.eid=eid;
		this.ename=ename;
		this.esal=sal;
		this.deg=deg;
	}
	int getId() {
		return eid;
	}
	String getName() {
		return ename;
	}
	int getSal() {
		return esal;
	}
	String getDeg() {
		return deg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		

	}

}
