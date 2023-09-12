// Kailyn Brown 9/8/23 Pig Latin Assignment

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        System.out.print("Please enter a word to translate into Pig Latin: ");

        Scanner input = new Scanner(System.in); // scans user input
        String word = input.next(); // assigns word the value of the users input
        int len = word.length(); // assigns len the length of the word
        char firstLetter = word.charAt(0); // assigns the char at position 1
        char secondLetter = word.charAt(1); // assigns at position 2

        // if its a vowel
        if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u' || firstLetter == 'A' || firstLetter == 'E' || firstLetter == 'I' || firstLetter == 'O' || firstLetter == 'U')
        {
            System.out.println(word + "way"); // prints word with way @ end
        }

        // if a vowel is the second letter
        else if (secondLetter == 'a' || secondLetter == 'e' || secondLetter == 'i' || secondLetter == 'o' || secondLetter == 'u' || secondLetter == 'y' || secondLetter == 'A' || secondLetter == 'E' || secondLetter == 'I' || secondLetter == 'O' || secondLetter == 'U' || secondLetter == 'Y')
        {
            for (int x = 1; x < len; x++) // runs from second position to end
            {
                System.out.print(word.charAt(x)); // prints second to end
            }
            System.out.println(firstLetter + "ay"); // adds the first letter + ay to the end
        }

        //else its double consonant
        else
        {
            for (int i = 2; i < len; i++) // runs from third position to end
            {
                System.out.print(word.charAt(i)); // prints third to end
            }
            System.out.print(firstLetter); // prints first letter
            System.out.println(secondLetter + "ay"); // prints second + ay, couldnt figure out how to stop first and second ascii from adding when in same line :-(
        }
    }
}

//if (word.charAt(y) == ' ') for later :D