import java.util.Scanner;
public class SumTillSingleDigit{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0 ;
        for(int i = scan.nextInt(); i>=10 || i<=-10 ; i = scan.nextInt()){
            sum+=i;
        }
        System.out.println(sum);
    }
}

