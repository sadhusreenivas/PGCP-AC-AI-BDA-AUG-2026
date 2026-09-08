class Grade{
	public static void main(String[] args) {
		int m1 = Integer.parseInt(args[0]);
		int m2 = Integer.parseInt(args[1]);
		int m3 = Integer.parseInt(args[2]);

		if(m1<40 || m2<40 || m3<40){
			System.out.println("Fail");
			return;
		}
        // bound checking
		int sum = m1+m2+m3;
		int avg = sum/3;
		System.out.println("Sum = "+sum+" Average Marks= "+avg);

		switch(avg/10){
		case 10:
		case 9: System.out.println("A+");
		case 8:
		case 7:System.out.println("A"); break;
		case 6:System.out.println("B");break;
		case 5:System.out.println("C");break;
		case 4:System.out.println("D");break;
		case 3:
		case 2:
		case 1:
		case 0: System.out.println("Fail");break;
		default:System.out.println("Pls enter valid marks!");
		}
	}
}