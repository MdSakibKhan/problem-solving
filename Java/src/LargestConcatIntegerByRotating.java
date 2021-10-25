public class LargestConcatIntegerByRotating {
    public static void main(String[] args){
        int [] array = {1,4,18,96};
        int largest = 0;
        int size = array.length;
        for (int start = 0; start<size ; start++){
            String num = "";
            for(int i = start; i< (start+size); i++){
                num+=array[i%size];
            }
            int finalNum = Integer.parseInt(num);
            if(finalNum>largest) largest = finalNum;
        }
        System.out.println(largest);
    }
}
