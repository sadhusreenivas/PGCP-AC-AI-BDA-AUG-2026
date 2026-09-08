class Pattern{
	public static void main(String[] args) {
		
		int spaces = 10;
		for(int i=1; i<=5; i++){
			System.out.println();
        // space managemt
			for(int k=0; k<=spaces; k++)
				System.out.print(" ");

			for(int j=1; j<=i; j++){
				System.out.print(" *  ");
			}
          spaces -= 2;
		}

		System.out.println();
	}
}