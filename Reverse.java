class Reverse{
	public static void main(String[] args) {
		int n = 101 + (int) (Math.random()*1000); //101 - 1100
		System.out.println(n);
        int x = n;
        int rev = 0;
        while(n>0){
        	int d = n%10;
        	rev = rev*10+d;
        	n = n/10;
        }
        System.out.println("Reverse of "+x+" is "+rev);
        if(rev == x)
        	System.out.println(x+" is a polindrome number");
	}
}