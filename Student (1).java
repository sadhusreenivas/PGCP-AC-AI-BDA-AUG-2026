class Student{
	//data 
	int rollNo;
	String Name;
	String place;
	static String course = " C-DAC";
	Student(){
		System.out.println("I am Default constrcutor");
	}
	//methods
	// void setStudent(int r , String n , String p){
	// 	rollNo = r;
	// 	Name = n;
	// 	place = p;
	// }
	//constructor
	public Student(int r , String m ,String p){
		rollNo= r;
		Name = m;
		place =p;
	}
	public Student(int r , String m ){
		rollNo= r;
		Name = m;
	}

	public String toString(){
		return rollNo +" " +Name +"  "+place+ " "+course;
	}
	public static void main(String[] args) {
		Student s1 = new Student(101,"Alice","Hyd");
		Student s2 = new Student(102,"Bob");
		System.out.println(s1);
		System.out.println(s1); // Student@4c873330
		System.out.println(s1.hashCode());
		System.out.println(s1.toString()); //Student@4c873330

	}
}