import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		int []arr = new int[200];
		for(int c = 0; c < arr.length; c++){
			arr[c] = (int)(Math.random()*200);
		}
		for(int c = 0; c < arr.length-1; c++){
			for(int c1 = 0; c1 < arr.length-c-1; c1++){
				if(arr[c1] > arr[c1+1]){
					int c2 = arr[c1];
					arr[c1] = arr[c1+1];
					arr[c1+1] = c2;
				}
			}
		}
		for(int c3 = 0; c3 < arr.length; c3++){
			System.out.print(arr[c3] + ", ");
		}
		System.out.println("");
	}
}
