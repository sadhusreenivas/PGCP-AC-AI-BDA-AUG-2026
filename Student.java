class Student{
	// data 
    int rno;
    String name;
    String course;
    static String org ="C-DAC Hyd";

    // setter or mutator
    void setStudent(int r, String n, String c){
    	rno = r;
    	name = n;
    	course = c;
    }
    //getter or accessor
    void getStudent(){
    	System.out.println(rno+" "+name+" "+course+" "+org);
    }

    public static void main(String[] args) {
    	
    	Student s1 = new Student();
    	s1.setStudent(123,"ABC","C-DAC course");
    	s1.getStudent();

    }
}