class ArraysDemo{
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		String[] cities = {"Hyd","Blr", "Jaipur","Del","Goa", "Pune", "Ngp"}; //

		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i]+" "); //0 0 0 0 0 0 0 0 0 0 
		System.out.println();

		for(int i=0; i<arr.length; i++)
			arr[i] = 1+ (int) (Math.random()*25); // 1- 25

		for(int x: arr){
			System.out.println(x+ " ! "+ StrongNumDemo.factorial(x));

		}

        System.out.println();
		for(int i=0; i<cities.length; i++)
			System.out.println(cities[i]);

		for(String s : cities)
			System.out.println(s);
	}
}