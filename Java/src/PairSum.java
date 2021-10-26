import java.util.HashMap;

public class PairSum {
    public static void main(String[] args){

        int[] arrayOfNumbers = {1,2,3,4};
        int targetValue = 7;

        HashMap arrayHashMap = new HashMap();

        for(int i = 0 ; i < arrayOfNumbers.length; i++){
            int firstNumber = arrayOfNumbers[i];
            int secondNumber = targetValue - firstNumber;
            if(arrayHashMap.containsKey(secondNumber)){
                System.out.println("Pair Is : " + firstNumber + "," +  secondNumber);
            }
            else{
                arrayHashMap.put(firstNumber, true);
            }
        }
    }
}
