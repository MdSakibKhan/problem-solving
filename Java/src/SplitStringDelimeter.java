import java.util.LinkedList;

public class SplitStringDelimeter {

    static LinkedList<String> getWordList(String sentence, char delimeter){
        LinkedList<String> list = new LinkedList<String>();
        String word = "";
        for(int i = 0 ; i < sentence.length(); i++){
            if(sentence.charAt(i)!=delimeter){
                word+=sentence.charAt(i);
            }
            else if(word.length()>0){
                list.add(word);
                word = "";
            }
        }
        if(word.length()!=0) list.add(word);
        return list;
    }

    public static void main(String [] args){
        String sentence = "###I#am#####a#Software####Engineer";
        char delimeter = '#';
        LinkedList<String> wordList = getWordList(sentence, delimeter);
        for(String i : wordList){
            System.out.println(i);
        }
    }
}
