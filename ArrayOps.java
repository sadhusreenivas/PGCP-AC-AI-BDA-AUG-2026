class ArrayOps{
	public static void main(String[] args) {
		
		int[] numArr = new int[40];
		// populate the array
		for(int i=0; i<numArr.length; i++)
		numArr[i] = 1 + (int) (Math.random()*100); // 1 - 100
        // printing array
	    int sum = 0;
	    for(int x: numArr){
	    	System.out.print(x+" ");
	    	sum += x;
	    }
	    double avg = sum/(double)numArr.length;
	    System.out.println("Sum = "+sum+"\t Avg= "+avg);
        
        // min and max
        int min = numArr[0];
        int max = numArr[0];

        for(int i=0; i<numArr.length; i++){
        	if(numArr[i] <min)
        		min = numArr[i];
            
            if(numArr[i] > max)
            	max = numArr[i];
        }
        System.out.println(min + " "+max);

        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Enter an element to search");
        int searchItem = in.nextInt();
        boolean flag = false;
        for(int i=0; i<numArr.length; i++){
        	if(searchItem == numArr[i]){
        		System.out.println(searchItem+" is found at index: "+i);
                flag = true;
                break;
        	}
         }
         if(flag == false)
         	System.out.println(searchItem+" is not found!");

         // sorting 
         java.util.Arrays.sort(numArr);
         for(int y: numArr)
         	System.out.print(y+" ");
	}
}