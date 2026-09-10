//parent class
class Emp{
	//data
	private int eid;
	private String ename;
	private double basic;
	private String city;
	private String org = "C-DAC";
	//setter
	public void setEmp(int eid , String ename, double basic,String city){
		this.eid = eid;
		this.ename = ename;
		this.basic = basic;
		this.city =city;
	}

	//constructor
	public Emp(int eid , String ename, double basic,String city){
		this.eid = eid;
		this.ename = ename;
		this.basic = basic;
		this.city =city;
	}
	//getter
	public void dispEmp(){
		System.out.println(eid+" "+ename+" "+basic+" "+city+" "+org);
	}
	public void dispSalary(){
		double salary = (basic) + (0.3+0.1+0.2)*(basic);
		System.out.println("salary : "+salary);
	}
	public double getBonus(){
		return basic;
	}
}

//child class
class TechEmp extends Emp{

	private int bonus;
	public TechEmp(int eid , String ename, double basic,String city,int bonus){
		super(eid,ename,basic,city);
		this.bonus = bonus;	
	}
	//setEmp() and dispEmp()  and dispSalary()

	public void dispSalary(){
		double salary = getBonus() + (0.3+0.1+0.2)*(getBonus()) + bonus;
		System.out.println("salary : "+salary);
	}

	public void dispEmp(){
	 	super.dispEmp();
	 	System.out.println(bonus);	
	}
	

}
public class InheritenceEx{
	public static void main(String[] args) {
		Emp e1 = new Emp(101,"Alice",30000.0,"Hyd");
		e1.dispEmp();  // 101 Alice 30000.0 Hyd C-DAC
		e1.dispSalary();
		System.out.println("***************************");


		TechEmp te1 = new TechEmp(102,"Bob",35000,"Pune",10000);
		te1.dispEmp();  //102 Bob 35000.0 Pune C-DAC
		te1.dispSalary();

	}
}

//if in parent class data initialized using setters , then in child class constructor defaultly(implicitly) uses super constructor
// if in parent class data initialized using constructor, then in child class  we need to specifically write super constructor


//parent class(no-constructor) then child class  auto super constructor
//parent class(constructor) then manually write super constrcutor

//techEmp had did a good work and given a bonus