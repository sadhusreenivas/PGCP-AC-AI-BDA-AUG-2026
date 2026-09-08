import java.util.Scanner;
class Range{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Range");
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		int primeCount = 0;

		for (int i=start;i<=end; i++){ // outer
			int count = 0;
            for(int j=1;j<=i/2;j++){ // inner
            	if(i%j==0){
            		count++;
            		if(count>1)
            			break;
            	}
            } // inner close

            if(count == 1){
            	System.out.println("Prime Number: "+i);
            	primeCount++;
            }
		} // outer close

		System.out.println("Count of Primes: "+primeCount);
	}

}