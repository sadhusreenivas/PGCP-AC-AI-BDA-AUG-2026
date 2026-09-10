class Vechile{
	void run(){
		System.out.println("Vechile is running");
	}
}
class Bike extends Vechile{
	// @Override
	// void run(){
	// 	System.out.println("Bike is running");
	// }
}
public class InheritenceDemo{
	public static void main(String[] args) {
		Vechile v = new Vechile();
		v.run(); 
		Bike b = new Bike();
		b.run();		
	}
}