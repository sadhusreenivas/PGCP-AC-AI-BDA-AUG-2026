
import java.util.*;
class Sample{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();

		//upper half
		for(int i =1 ; i <= num ;i++){
			//left spaces
			for(int  j = 1 ; j <= num-i;j++){
				System.out.print(" ");
			}
			//First star
			System.out.print("*");
			//middle spaces
			for(int k = 1; k <= 2*i - 3;k++){
				System.out.print(" ");
			}
			//second star
			if(i > 1){
			System.out.print("*");
			}
			System.out.println();
		}

		//lower half
		for(int i = num-1 ;i >= 1 ;i--){   
			//first spaces
			for(int j = 1 ; j <= num -i ;j++ ){
				System.out.print(" ");
			}
			//first star
			System.out.print("*");
			//middle spaces
			for(int k = 1 ; k <= 2*i - 3 ;k++){
				System.out.print(" ");
			}
			//second star
			if(i > 1){
			System.out.print("*");
			}
			System.out.println();
		}

	}
} 