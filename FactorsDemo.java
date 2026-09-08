class FactorsDemo{
public static void main(String[] args) {
int n = Integer.parseInt(args[0]);
int i,count = 0;
int sum = 0;
for(i=1;i<=n/2;i++){
	if(n%i == 0){
		System.out.println(i+" is factor of "+n);

	 sum += i;	
     count++;
     if(count>1) // prime number
     	break;
	}
} 	

System.out.println("Total factors of "+n+" is: "+(count+1));
if(count == 1)
	System.out.println(n+" is a prime");
else 
	System.out.println(n+" is not prime");

if(sum == n)
	System.out.println(n+" is perfect");
else 
	System.out.println(n+" is not perfect");

System.out.println("no of iterations: "+i);
}

}