class StrongNumDemo{

    static int factorial(int num){
    	if(num == 1 || num == 0)
    		return 1;

    	return num*factorial(num-1); //recursion 
    }

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Pls enter a number");
 		int n = scanner.nextInt();
        int x = n;
        int sum = 0;
        while(n>0){
        	int d = n%10;
            sum = sum + factorial(d);
            n = n/10;
        }
        
        if(sum == x)
        	System.out.println(x+" is a strong number");
        else
        	System.out.println(x+" is not a strong number");
	}
}