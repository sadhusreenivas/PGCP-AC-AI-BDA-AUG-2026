public class Calculation{
	public void fact(int num){
		int f = 1;
		for(int i = num ; i>= 1; i--){
			f = f*i;
		}
		System.out.println("fact of "+num+" : "+f);
	}
	public static void main(String[] args) {
		new Calculation().fact(5);

	}
}
