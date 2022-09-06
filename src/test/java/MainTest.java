import java.util.Arrays;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.lang.reflect.Array;
import java.util.ArrayList;

class MainTest {

    private final String testString = "Hello Yes Fine Racecar";
    private final PalindromeCheckInit testPalCheck = new PalindromeCheckInit();
    private final String[] array = {"hello", "yes", "fine", "racecar"};
    private final ArrayList<String> testList = new ArrayList<>(Arrays.asList(array));

    @Test
    @DisplayName("Testing spilt method")
    void testPalSplit(){
        Assertions.assertEquals(testList, testPalCheck.split(testString));
    }
    @Test
    @DisplayName("Testing palindrome list returned 1")
    void testPalParseChoice1(){

        String[] expectedArray = {"racecar"};
        ArrayList<String> expected = new ArrayList<>(Arrays.asList(expectedArray));

        Assertions.assertEquals(
                expected,
                testPalCheck.parseCheck(testPalCheck.split(testString), "1")
        );
    }

    @Test
    @DisplayName("Testing palindrome list returned with choice 2")
    void testPalParseChoice2(){

        String[] expectedArray = {"racecar"};
        ArrayList<String> expected = new ArrayList<>(Arrays.asList(expectedArray));
        Assertions.assertEquals(
                expected,
                testPalCheck.parseCheck(testPalCheck.split(testString), "2")
        );
    }

    @Test
    @DisplayName("Testing palindrome list returned with choice 3")
    void testPalParseChoice3(){

        String[] expectedArray = {"racecar"};
        ArrayList<String> expected = new ArrayList<>(Arrays.asList(expectedArray));
        Assertions.assertEquals(
                expected,
                testPalCheck.parseCheck(testPalCheck.split(testString), "3")
        );
    }

    @Test
    void testParseChoice1(){

        PalindromeCheckInit testPalCheck = new PalindromeCheckInit();
        String[] array = {"Hello", "Yes", "Fine", "Racecar"};
        ArrayList<String> testList = new ArrayList<>(Arrays.asList(array));

        testPalCheck.parseCheck(testPalCheck.split(testString), "1");

        String[] expectedArray = {"racecar"};
        ArrayList<String> expected = new ArrayList<>(Arrays.asList(expectedArray));

        Assertions.assertEquals(
                expected,
                testPalCheck.parseCheck(testPalCheck.split(testString), "2")
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