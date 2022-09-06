public class PalThird implements PalInterface{

    // While loop method
    @Override
    public boolean isPalindrome(String str) {

        String noSpaces = str.replaceAll("\\s+", "").toLowerCase();
        int length = noSpaces.length();
        int front = 0;
        int back = length - 1; // reverse index method

        while(back > front){
            char frontChar = noSpaces.charAt(front++); // front++/back-- only increments AFTER the indexing (POST-increments)
            char backChar = noSpaces.charAt(back--);   // vice versa for ++front/--back
            if (frontChar != backChar){
                return false;
            }
        }
        return true;
    }
}