import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int c = 0; c < 100; c++){
			arr.add(new Integer((int)(Math.random()*100)));
		}
		printValuesInt(arr);
		System.out.println("");
		
		bubbleSort(arr);
		printValuesInt(arr);
		System.out.println("");
		
		selectionSort(arr);
		printValuesInt(arr);
		System.out.println("");
		
		insertionSort(arr);
		printValuesInt(arr);
		System.out.println("");
		
	}
	
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> arr){
		for(int c = 0; c < arr.size()-1; c++){
			for(int c1 = 0; c1 < arr.size()-c-1; c1++){
				if(arr.get(c1) > arr.get(c1+1)){
					int c2 = arr.get(c1);
					arr.set(c1, arr.get(c1+1));
					arr.set(c1+1, c2);
				}
			}
		}
		return(arr);
	}
	
	public static ArrayList<Integer> selectionSort(ArrayList<Integer> arr){
		int outer, inner, min_index;
		for(outer = 0; outer < arr.size(); outer++){
			min_index = outer;
			for(inner = outer+1; inner < arr.size(); inner++){
				if(arr.get(inner) < arr.get(min_index)){
					min_index = inner;
				}
			}
			int temp = arr.get(outer);
			arr.set(outer, arr.get(min_index));
			arr.set(min_index, temp);
		}
		return(arr);
	}
	
	public static ArrayList<Integer> insertionSort(ArrayList<Integer> arr){
		int outer, inner, key;
		for(outer = 1; outer < arr.size(); outer++){
			key = arr.get(outer);
			inner = outer-1;
			
			while(inner >= 0 && arr.get(inner) > key){
				arr.set(inner+1, arr.get(inner));
				inner = inner - 1;
			}
			arr.set(inner+1, key);
		}
		return(arr);
	}
	
	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
}
