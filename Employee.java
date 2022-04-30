class employee{
	String Name, Address;
	int Year;
	employee(String nam,int years, String addr){
		Name=nam;
		Year=years;
		Address=addr;
	}
	void Robert(){
		System.out.println(Name+ "       " +Year + "          "+Address);                                          
	}
	void Sam(){
		System.out.println(Name+ "          " +Year + "          "+Address);                                          
	}
	void John(){
		System.out.println(Name+ "         "+Year + "          "+Address);                                          
	}
}
public class Employee{
	public static void main(String args[]){
		System.out.println("Name" +   "    Year of Joining     " + "Address" );
		employee E1 = new employee("Robert", 1994, "64C-WallsStreet");
		E1.Robert();
		employee E2 = new employee("Sam", 2000, "68D-WallsStreet");
		E2.Sam();
		employee E3 = new employee("John", 1999, "26B-WallsStreet");
		E3.John();
	}
}
