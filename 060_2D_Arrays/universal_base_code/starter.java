import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the x variable for the 2D array");
		int x = sc.nextInt();
		
		System.out.println("Enter the y variable for the 2D array");
		int y = sc.nextInt();
		
		int [][]arr = new int[x][y];
		
		for(int c = 0; c < arr.length; c++){
			for(int c1 = 0; c1 < arr[0].length; c1++){
				arr[c][c1] = (int)(Math.random()*10)+1;
			}
		}
		rowavg(arr);
		arravg(arr);
		printarr(arr);
	}
	
	public static void rowavg(int arr[][]){
		int a = 0;
		int c2 = 0;
		for(int c = 0; c < arr.length; c++){
			for(int c1 = 0; c1 < arr[0].length; c1++){
				a = a + arr[c][c1];
			}
			int []ravg = new int[arr[0].length];
			ravg[c2]= a / arr[0].length;
			int rnum = c2 + 1;
			System.out.println("Row number " + rnum + " has an average of " + ravg[c2]);
			c2++;
			a = 0;
		}
	}
	
	public static void arravg(int arr[][]){
		int arravg = 0;
		for(int c = 0; c < arr.length; c++){
			for(int c1 = 0; c1 < arr[0].length; c1++){
				arravg = arravg + arr[c][c1];
			}
		}
		int arrnum = arr.length * arr[0].length;
		arravg = arravg/arrnum;
		System.out.println("The average of the whole 2D Array is "+ arravg);
	}
	
	public static void printarr(int arr[][]){
		for(int c = 0; c < arr.length; c++){
			for(int c1 = 0; c1 < arr[0].length; c1++){
				System.out.print(arr[c][c1] + " ");
			}
			System.out.println();
		}
	}
}
