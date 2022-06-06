import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;



class starter {
	public static void main(String args[]) throws FileNotFoundException{
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num = rand.nextInt(2499);
		
		File text = new File("./wordlist.txt");
		
		Scanner xc = new Scanner(text);
		
		int lineNumber = 1;
		
		ArrayList <String> words = new ArrayList <String>(2499);
		
        while(xc.hasNextLine()){		
            String line = xc.nextLine();
            words.add(line);
        }
		
		String targword = words.get(num);
		words.remove(num);
		
		int guesscount = game(targword);
		
		if(guesscount == 7){
		    System.out.println("You did not guess the correct word in 7 tries. Try again!");
		}
		else{
		    System.out.println("You Guessed the Correct Word in " + guesscount + " Guess!");
		}
		
	}
	
	public static int game(String targword){
    Scanner sc = new Scanner(System.in);
    int guesscount = 0;
	System.out.println("Here are the rules: You have six chances to guess the secret five-letter word. Type in a word as a guess, and we will tells you which letters are or aren't in the word. The goal is to figure out the secret word with the fewest guesses.");
System.out.println("");
    
    for(int count = 0; count < 7; count++){
            System.out.println("Enter in your guess, the word must be five-letters long.");
        
        String guess = sc.nextLine();
        
        while(guess.length() < 5 || guess.length() > 5){
          System.out.println("Your guess must be five-letters long, please enter a different guess.");
          guess = sc.nextLine();
        }
        guesscount++;
      
        if(guess.equalsIgnoreCase(targword)){
            return(guesscount);
        }
        else{
            for(int c = 0; c < 5; c++){
                String temp = (guess.substring(c, c + 1));
                if(temp.equals(targword.substring(c, c + 1))){
                    System.out.print(temp.toUpperCase());
                }
                else{
                    boolean hasletter = hasLetter(temp, targword);
                    if(hasletter == true){
                        System.out.print(temp.toUpperCase() + ".");
                    }
                    else{
                        System.out.print(temp.toLowerCase());
                    }
                }
            }   
            System.out.println("");
        }
    }
        return(guesscount);
    }
    
    public static boolean hasLetter(String letter, String targword){
        for(int c1 = 0; c1 < 5; c1++){
            if(letter.equals(targword.substring(c1, c1 + 1))){
                return(true);
            }
        }
        return(false);
    }
}
