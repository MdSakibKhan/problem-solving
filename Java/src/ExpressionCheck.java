import java.util.HashMap;
import java.util.Stack;

public class ExpressionCheck {
    public static void main(String[] args){
        String expression = "{[{]}";
        System.out.println(isValidExpression(expression));
    }

    static boolean isValidExpression(String expression){

        HashMap<Character,Character> hashmap = new HashMap<>();
        hashmap.put('}', '{');
        hashmap.put(')', '(');
        hashmap.put(']', '[');

        Stack stack = new Stack();

        for (int i = 0 ; i<expression.length(); i ++){
            char bracket = expression.charAt(i);
            if(isOpening(bracket)){
                stack.push(bracket);
            }
            else if(isClosing(bracket)){
                char previousOpening = (char) stack.pop();
                char desiredOpening = hashmap.get(bracket);
                if(previousOpening != desiredOpening){
                    return false;
                }
            }
        }
        if(stack.size() != 0) return false;
        return true;
    }

    private static boolean isClosing(char bracket) {
        if(bracket==')'|| bracket=='}' || bracket == ']') return true;
        return false;
    }

    private static boolean isOpening(char bracket) {
        if(bracket == '(' || bracket == '{' || bracket == '[') return true;
        return false;
    }


}
