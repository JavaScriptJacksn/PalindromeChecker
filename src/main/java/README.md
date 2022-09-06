# Palindrome checker

This program takes a sentence from the user via the Scanner class and
returns to the user a list of the palindromes found in their input.
The user is given the option to choose the method used to check for the palindromes.

### The methods are

- For loop method (PalFirst class)
- String Builder method (PalSecond class)
- While loop method (PalThird class)

### How the program works

- The user is asked and enters the text
- The user is asked and enters 1,2 or 3 to choose the option of method
- The text is put into lower case and spilt up into words
- These words are stored in an ArrayList
- They are passed one at a time to the chosen palindrome algorithm
- A list is then built from the words that returned 'true' from these checks

### Testing

(As in order shown in screenshot)

Test 1 - To test that the parseCheck method correctly used each palindrome
method to construct and return an ArrayList containing the palindromes from
the text entered.

Test 2 - To test the PalSecond class correctly identifies
palindromes and non palindromes.

Test 3 - To test the PalFirst class correctly identifies palindromes and non
palindromes.

Test 4 - To test the split method correctly splits text given to it into a lower 
case ArrayList.

Test 5 - To Test the PalThird class correctly identifies palindromes and non 
palindromes.

![img.png](img.png)