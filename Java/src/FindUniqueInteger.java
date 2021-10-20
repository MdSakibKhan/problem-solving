import java.util.HashMap;
public class FindUniqueInteger {
    public static void main(String [] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int[] array = {9, 2, 2, 3, 3, 4, 4};
        for(int i = 0 ; i < array.length ; i++){
            int key = array[i];
            if(hashMap.containsKey(key)){
                hashMap.put(key, hashMap.get(key)+1);
            }
            else hashMap.put(key, 1);
        }
        hashMap.forEach((key,value)->{
            if(value == 1) System.out.println("Unique Value = " + key);
        });
    }
}
