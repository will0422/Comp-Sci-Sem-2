import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		
		factorial(4);
		
	}
	public static int factorial(int base){
		if(base == 1){
			System.out.println(base);
			return 1;
		}
		else{
			return base * factorial(base - 1);
			System.out.println(base);
		}
		
	}
}
