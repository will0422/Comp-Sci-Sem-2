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
		int outer, inner, min_index;
		for(outer = 0; outer < arr.length; outer++){
			min_index = outer;
			for(inner = outer+1; inner < arr.length; inner++){
				if(arr[inner] < arr[min_index]){
					min_index = inner;
				}
			}
			int temp = arr[outer];
			arr[outer] = arr[min_index];
			arr[min_index] = temp;
		}
		for(int c3 = 0; c3 < arr.length; c3++){
			System.out.print(arr[c3] + ", ");
		}
		System.out.println("");
	}
}
