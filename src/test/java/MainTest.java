import java.util.Arrays;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.lang.reflect.Array;
import java.util.ArrayList;

class MainTest {

    @Test
    @DisplayName("Testing spilt method")
    void testPalSplit(){

        PalindromeCheckInit testPalCheck = new PalindromeCheckInit();
        String[] array = {"hello", "yes", "fine", "racecar"};
        ArrayList<String> testList = new ArrayList<>(Arrays.asList(array));

        Assertions.assertEquals(testList, testPalCheck.split("Hello Yes Fine Racecar"));
    }
    @Test
    @DisplayName("Testing palindrome list returned")
    void testPalParseChoice(){

        PalindromeCheckInit testPalCheck = new PalindromeCheckInit();
        String[] array = {"Hello", "Yes", "Fine", "Racecar"};
        ArrayList<String> testList = new ArrayList<>(Arrays.asList(array));

        testPalCheck.parseCheck(testPalCheck.split("Hello Yes Fine Racecar"), "1");

        String[] expectedArray = {"racecar"};
        ArrayList<String> expected = new ArrayList<>(Arrays.asList(expectedArray));

        Assertions.assertEquals(
                expected,
                testPalCheck.parseCheck(testPalCheck.split("Hello Yes Fine Racecar"), "1")
        );
        Assertions.assertEquals(
                expected,
                testPalCheck.parseCheck(testPalCheck.split("Hello Yes Fine Racecar"), "1")
        );
        Assertions.assertEquals(
                expected,
                testPalCheck.parseCheck(testPalCheck.split("Hello Yes Fine Racecar"), "1")
        );
    }

    @Test
    @DisplayName("Test PalFirst")
    void testPalFirst(){
        PalFirst checker = new PalFirst();
        Assertions.assertTrue(checker.isPalindrome("racecar"));
        Assertions.assertFalse(checker.isPalindrome("hello"));
    }

    @Test
    @DisplayName("Test PalSecond")
    void testPalSecond(){
        PalSecond checker = new PalSecond();
        Assertions.assertTrue(checker.isPalindrome("racecar"));
        Assertions.assertFalse(checker.isPalindrome("hello"));
    }

    @Test
    @DisplayName("Test PalThird")
    void testPalThird(){
        PalThird checker = new PalThird();
        Assertions.assertTrue(checker.isPalindrome("racecar"));
        Assertions.assertFalse(checker.isPalindrome("hello"));
    }



}