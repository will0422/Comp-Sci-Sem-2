import pkg.*;
import java.util.*;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		
		ArrayList <String> cookies = new ArrayList<String>(3);
		
		System.out.println("How many cookies would you like?");
		
		int amount = sc.nextInt();
		for(int c = 0; c < amount; c++){
			cookies.add(c, "Cookies");
		}
		for(int c = 0; c < cookies.size(); c++){
			System.out.println(cookies.get(c));
		}
		
	}
}
