public class PalFirst implements PalInterface {

    // For loop method
    @Override
    public boolean isPalindrome(String str) {

        String noSpaces = str.replaceAll("\\s+", "").toLowerCase();
        int length = noSpaces.length();
        int front;
        int back = length - 1; // reverse index method

        for (front = 0; front < length; front++){
            if (noSpaces.charAt(front) != noSpaces.charAt(back--)){
                return false;
            }
        }
        return true;
    }
}