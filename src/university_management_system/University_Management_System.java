package university_management_system;

import java.util.Scanner;

public class University_Management_System {
	
		public static void main(String[]args) {

		System.out.println("Starting the project");
//		Employee emp1 = new Employee(101,"Asif Muhammad Yousuf","CSE","Alberta");
//		Employee emp2 = new Employee(102,"Anisu Islam","CSE","Tampere");
	       
	    String cond= "value";
	    while(cond!="exit") {
	    	Scanner sc= new Scanner(System.in);
	    	
	    	System.out.println("Enter id:");
	    	String id= sc.next();
	    	if(id.equals("exit")) {
	    		cond="exit";
	    		break;
	    	}
	    	System.out.println("Enter name:");
	    	String name= sc.next();
	    	if(name.equals("exit")) {
	    		cond="exit";
	    		break;
	    }
	    	System.out.println("Enter dept:");
	    	String dept = sc.next();
	    	if(dept.equals("exit")) {
	    		cond="exit";
	    		break;
	    	}
	    		System.out.println("Enter address:");
	    		String address= sc.next();
		    	if(address.equals("exit")) {
		    		cond="exit";
		    		break;
	    	
	    }
      }
	 }
    }

