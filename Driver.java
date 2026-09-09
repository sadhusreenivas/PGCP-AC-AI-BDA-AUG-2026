class Employee{
		//data 
	     int num =100;
		private int empId;
		private String ename;
		private double salary;
		private static String org;
		static{
			org ="C-DAC";
			System.out.println("I am Static Block");
		}
	
		//methods

		//setter -> Constructor 
		public Employee(int empId , String ename, double salary){
			this.empId = empId;
			this.ename = ename;
			this.salary = salary;
		}
		// getter -> toString();

		public  String  toString(){
			return empId+" "+ename+" "+salary+" "+org;
		}

}

public class Driver{
	public static void main(String[] args) {
		Employee e1 = new Employee(100,"Bob",50000.0);
		System.out.println(e1);
		
	}
}