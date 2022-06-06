import java.util.*;

class starter {
	public static void printArrayList(ArrayList <Integer> arr){
		int c1 = arr.size();
		for(int c = 0; c < c1; c++){
			System.out.println(arr.get(c));
		}
	}
	
	public static void addValuesArrayList(int n, ArrayList <Integer> arr){
		Random rand = new Random();
		for(int c = 0; c < n; c++){
			int z = (int)(Math.random()*10);
			arr.add(z);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList <Integer> arr = new ArrayList <Integer>(5);
		System.out.println("How many values do you want to add?");
		int x = sc.nextInt();
		
		addValuesArrayList(x, arr);
		printArrayList(arr);
		
		
	}
}
