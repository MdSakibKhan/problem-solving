import java.util.Random;

public class RandomNumber {
    public static void main(String [] args){
        int start = 5;
        int end = 10;
        Random rand = new Random();
        int randomNumber = start + rand.nextInt(end - start + 1);
        System.out.println(randomNumber);
    }
}
