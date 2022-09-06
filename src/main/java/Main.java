import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

//        MyMaths mathsThing = new MyMaths(); // Instantiating class MyMaths
//        System.out.println("2.5 x 2.5 = " + mathsThing.multiply(2.5f, 2.5f));
//        System.out.println("2 + 2 = " + mathsThing.multiply(2, 2));

        PalindromeCheckInit palCheck = new PalindromeCheckInit();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = scan.nextLine();

        ArrayList<String> palindromes = palCheck.parseCheck(palCheck.split(text), palCheck.getChoice());
        System.out.println("your palindromes: " + palindromes);
    }

}
