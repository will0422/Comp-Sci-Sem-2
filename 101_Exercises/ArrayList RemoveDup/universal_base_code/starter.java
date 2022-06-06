import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		System.out.println("");
		System.out.println("");
		removeDup(arr1);		//Create this method.
		printValuesInt(arr1);
		System.out.println("");
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*100)));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	public static void removeDup(ArrayList <Integer> arr1){
		for(int c = 0; c < arr1.size(); c++){
			for(int c1 = c+1; c1 < arr1.size(); c1++){
				int x = arr1.get(c1);
				int i = arr1.get(c);
				if(i == x){
					arr1.remove(c1);
					c1--;
				}
			}
		}
	}
}
