//overloading
public class OverloadEx{
	//method
	public void sum(int num1 , int num2){
		System.out.println("sum : "+(num1+num2));
	}
	public void sum(int num1 , int num2 , int num3 ){
		System.out.println("sum :"+(num1+num2+num3));
	}
	public void sum(double num1,double num2){
			System.out.println("sum : "+(num1+num2));
	}
	public static void main(String[] args) {
		OverloadEx m = new OverloadEx();
		m.sum(10 ,20);
		m.sum(10,20,30);
		m.sum(10.0, 20.0);

	}
}