public class StringMatch {
    static boolean checkValidity(String text){

        int size = text.length();

        if(size<9 || size>10) return false;
        else if(text.charAt(5)!='-' && size==10) return false;

        for (int i = 0 ; i<text.length() ; i++){
            if(i == 5 && text.charAt(i) == '-'){
                continue;
            }
            else if (!Character.isDigit(text.charAt(i))){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args){
        // Regex = [0-9]{5}[-]{0,1}[0-9]{4}
        String text1 = "22222-2222"; ///Valid
        String text2 = "222222222"; ///Valid
        String text3 = "2222222222"; //Invalid
        String text4 = "1234-1234"; //Invalid
        System.out.println(checkValidity(text1));
        System.out.println(checkValidity(text2));
        System.out.println(checkValidity(text3));
        System.out.println(checkValidity(text4));
    }
}
