class starter
{
    static main(args) //throws FileNotFoundException
    {
        var num = Math.ceil(Math.random()*2499);
        const text = FileReader.readAsBinaryString("./wordlist.txt");
        var targword = text[num];
        var guesscount = starter.game(targword);
        if (guesscount == 7){
            console.log("You did not guess the correct word in 7 tries. Try again!");
        }
        else{
            console.log("You Guessed the Correct Word in " + guesscount + " Guess!");
        }
    }
    static game(targword)
    {
        var guesscount = 0;
        console.log("Here are the rules: You have six chances to guess the secret five-letter word. Type in a word as a guess, and we will tells you which letters are or aren\'t in the word. The goal is to figure out the secret word with the fewest guesses.");
        console.log("");
        for (var count = 0; count < 7; count++)
        {
            console.log("Enter in your guess, the word must be five-letters long.");
            var guess = window.prompt();
            while (guess.length < 5 || guess.length > 5)
            {
                console.log("Your guess must be five-letters long, please enter a different guess.");
                guess = window.prompt;
            }
            guesscount++;
            if (guess.equalsIgnoreCase(targword))
            {
                return (guesscount);
            }
            else
                {
                for (var c = 0; c < 5; c++)
                {
                    var temp = (guess.substring(c,c + 1));
                    if (temp== targword.substring(c,c + 1))
                    {
                        console.log(temp.toUpperCase());
                    }
                    else
                        {
                        var hasletter = starter.hasLetter(temp, targword);
                        if (hasletter == true)
                        {
                            console.log(temp.toUpperCase() + ".");
                        }
                        else
                            {
                            console.log(temp.toLowerCase());
                        }
                    }
                }
                console.log("");
            }
        }
        return (guesscount);
    }
    static hasLetter(letter, targword)
    {
        for (var c1 = 0; c1 < 5; c1++)
        {
            if (letter == targword.substring(c1,c1 + 1))
            {
                return (true);
            }
        }
        return (false);
    }
}