public class ValidStringCheck {
    public static void main(String[] args) {
        String text1= "_geeks"; // valid
        String text2= "0_geeks"; // invalid
        System.out.println(isValidString(text1));
        System.out.println(isValidString(text2));
    }

    private static boolean isValidString(String text) {

        if(!(Character.isAlphabetic(text.charAt(0)) || text.charAt(0)=='_')) return false;

        for(int index = 1 ; index<text.length() ; index++){
            if(!(Character.isAlphabetic(text.charAt(index))
                    || text.charAt(index)=='_'
                    || Character.isDigit(text.charAt(index)) )) return false;
        }
        return true;

    }
}
