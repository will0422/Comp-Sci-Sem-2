import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Palindrome("potato", 0);
		System.out.println("");
		addition(5, 2);
	}
	public static void Palindrome(String pal, int n){
		if(n == pal.length()){
			return;
		}
		else{
			System.out.print(pal.substring(n, n+1));
			Palindrome(pal, n+1);
			if(n == 0){
				return;
			}
			else{
				System.out.print(pal.substring(n-1, n));
			}
		}
	}
	
	public static int addition(int x, int y){
		if(x == 1){
			return(x + y);
		}
		return x + function(x-1,y);
	}
}
