import java.util.Scanner;
import java.util.regex.*;
public class RegexProb {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a valid Car Number");
        String carNumber = scan.nextLine();
        String myRegex = "[a-zA-Z]{2,3}-[0-9]{3}-[0-9]{3}"; //Eg : Ga-123-123 , Cha-123-123
        boolean hasMatch = Pattern.matches(myRegex, carNumber);
        System.out.println(hasMatch? "Valid" : "Invalid");
    }
}

