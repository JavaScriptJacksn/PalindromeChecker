import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromeCheckInit {

    public ArrayList<String> split(String text) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(text.toLowerCase().split(" ")));
        return words;
    }

    public String getChoice(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Which palindrome checker would you like to use?");
        System.out.println("1. For loop indexing 2. String builder 3. While loop indexing");

        return scan.nextLine();
    }

    public ArrayList<String> parseCheck(ArrayList<String> words, String choice){

        ArrayList<String> palindromes = new ArrayList<>();

        for (String word : words) {
            switch (choice) {
                case "1" -> {
                    PalFirst checker1 = new PalFirst();
                    if (checker1.isPalindrome(word)) {
                        System.out.println(word + " is a palindrome!");
                        palindromes.add(word);
                    }
                }
                case "2" -> {
                    PalSecond checker2 = new PalSecond();
                    if (checker2.isPalindrome(word)) {
                        System.out.println(word + " is a palindrome!");
                        palindromes.add(word);
                    }
                }
                case "3" -> {
                    PalThird checker3 = new PalThird();
                    if (checker3.isPalindrome(word)) {
                        System.out.println(word + " is a palindrome!");
                        palindromes.add(word);
                    }
                }
            }
        }
        return palindromes;
    }
}
