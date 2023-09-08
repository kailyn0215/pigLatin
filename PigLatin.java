// Kailyn Brown 9/8/23 Pig Latin Assignment

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String vowels = "aeiou";
        String consonants = "";
        int len = word.length();
        for (int x = 0; x < len; x++)
        {
            if ((word[0]).equals(vowels[x]))
            {
                System.out.println(word + "way");
            }
        }
        for (int i = 0; i < len; i++)
        {
            if (word[i].equals("a"))
            {
                System.out.println("found a");
            }
            word.substring(i, i + 1); //up to but not including  i + 1
        }
        //word[i]
    }
}