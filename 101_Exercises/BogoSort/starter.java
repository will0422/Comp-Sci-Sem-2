import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int [] bogo = new int[10];
		bogo = {9, 1, 5, 3, 4, 2, 6, 10, 8, 7};
		
		
		bogoSort(bogo);
		
	}
	
	public bogoSort(int[] i) {
	while(!isSorted(i)) {
		shuffle(i);
	}
}

private void shuffle(int[] i) {
	for(int x = 0; x < i.length; ++x) {
		int index1 = (int) (Math.random() * i.length), index2 = (int) (Math.random() * i.length);
		int a = i[index1];
		i[index1] = i[index2];
		i[index2] = a;
	}
}

private boolean isSorted(int[] i) {
	for(int x = 0; x < i.length - 1; ++x) {
		if(i[x] > i[x+1]) {
			return false;
		}
	}
	return true;
}
}
