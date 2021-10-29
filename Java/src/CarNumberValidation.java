public class CarNumberValidation {
    public static void main(String [] args){
        String c1 = "Ka-123-123"; //valid
        String c2 = "Cha-12-123"; //valid
        String c3 = "Kha-123-123"; //invalid

        System.out.println(checkCarNumberValidity(c1));
        System.out.println(checkCarNumberValidity(c2));
        System.out.println(checkCarNumberValidity(c3));
    }

    private static boolean checkCarNumberValidity(String c1) {

        int numberLength = c1.length();
        if(numberLength<10 || numberLength>10) return false;

        int lastDashIndex = numberLength-4;
        if(c1.charAt(lastDashIndex)!='-') return false;

        int dashCount = 0;
        String validationString = "";
        for (int index = numberLength-1 ; index>=0; index--){
            if(index==lastDashIndex) {
                dashCount++;
                boolean isNumber = checkNumberValidation(validationString);
                if(!isNumber || validationString.length()!=3) return false;
                else validationString="";

            }
            else if(index!=lastDashIndex && c1.charAt(index)=='-') {
                dashCount++;
                boolean isNumber = checkNumberValidation(validationString);
                if(!isNumber || validationString.length()>3 || validationString.length()<2) return false;
                validationString = "";
            }
            else if(dashCount == 2 && index == 0){
                validationString = c1.charAt(index)+validationString;
                boolean isNumber = checkNumberValidation(validationString);
                if(isNumber || validationString.length()<2 || validationString.length()>3) return false;
            }
            else validationString = c1.charAt(index)+validationString;
        }
        return true;
    }

    private static boolean checkNumberValidation(String validationString) {
        try {
            int number = Integer.parseInt(validationString);
            return true;
        }
        catch (Exception e){ }
        return false;
    }

}
