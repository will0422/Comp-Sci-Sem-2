import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		int []arr = new int[200];
		for(int c = 0; c < arr.length; c++){
			arr[c] = (int)(Math.random()*200);
		}
		int outer, inner, key;
		for(outer = 1; outer < arr.length; outer++){
			key = arr[outer];
			inner = outer-1;
			
			while(inner >= 0 && arr[inner] > key){
				arr[inner + 1] = arr[inner];
				inner = inner - 1;
			}
			arr[inner + 1] = key;
		}
		for(int c3 = 0; c3 < arr.length; c3++){
			System.out.print(arr[c3] + ", ");
		}
		System.out.println("");
	}
}
