package TwentyOneDaysAirTribe;

import java.util.ArrayList;
import java.util.List;

public class DecodeString394 {
    public static String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        List<Character> stack = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ']'){
                stack.add(s.charAt(i));
            }
            else{
                String substr = "";
                while (stack.getLast() != '['){
                    substr = stack.getLast() + substr;
                    stack.removeLast();
                }
                stack.removeLast();
                String k = "";
                char last = stack.getLast();
                while(!stack.isEmpty() && Character.isDigit(last)){
                    k = last + k;
                    stack.removeLast();
                    if(!stack.isEmpty()){
                        last = stack.getLast();
                    }
                }
                String repeated = substr.repeat(Integer.parseInt(k));
                for (int j = 0; j < repeated.length(); j++) {
                    stack.add(repeated.charAt(j));
                }
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String res = decodeString("3[a2[c]]");
        System.out.println(res);
    }
}
