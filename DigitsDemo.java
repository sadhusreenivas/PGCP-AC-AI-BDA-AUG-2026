class DigitsDemo{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int x = n;
        int sum = 0; 
		while (n>0){
			int digit = n%10;
			sum += Math.pow(digit, 3);
			n = n/10; // update stmt
		}
		System.out.println("Sum of cubes of digits of "+x+" is "+sum);
		if(sum == x)
			System.out.println(x+ " is Armstrong");

	}
}