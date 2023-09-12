// Kailyn Brown 9/8/23 Pig Latin Assignment

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int len = word.length();
        char firstLetter = word.charAt(0);
        char secondLetter = word.charAt(1);
        if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u')
        {
            System.out.println(word + "way");
        }
        else if (secondLetter == 'a' || secondLetter == 'e' || secondLetter == 'i' || secondLetter == 'o' || secondLetter == 'u' || secondLetter == 'y')
        {
            for (int x = 1; x < len; x++)
            {
                System.out.print(word.charAt(x));
            }
            System.out.println(firstLetter + "ay");
        }
        else
        {
            for (int i = 2; i < len; i++)
            {
                System.out.print(word.charAt(i));
            }
            System.out.println(firstLetter + secondLetter + "ay");
        }
    }
}