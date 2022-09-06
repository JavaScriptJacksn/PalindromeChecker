public class PalSecond implements PalInterface {

    // String builder method
    @Override
    public boolean isPalindrome(String str) {

        String noSpaces = str.replaceAll("\\s+", "").toLowerCase();

        StringBuilder sb1 = new StringBuilder(noSpaces);
        String reverse = sb1.reverse().toString(); // Automatic reverse method on StringBuilder class and then toString conversion
        if (noSpaces.equals(reverse)){
            return true;
        }else {
            return false;
        }
    }
}
