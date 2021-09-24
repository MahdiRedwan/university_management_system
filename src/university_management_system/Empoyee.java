package university_management_system;

public class Empoyee {
	
	    private int id;
	    private String name;
	    private String dept;
	    private String address;
	    public  Empoyee(int id, String name, String dept, String address){
	    	super();
	        this.id=id;
	        this.name=name;
	        this.dept=dept;
	        this.address=address;
	    }
	    public int getId(){
	        return id;
	    }
	    public String getName(){
	        return name;
	    }
        public String getDept(){
	        return  dept;
	    }
	    public String getAddress(String address){
	        return address;
	    }

	   

}
