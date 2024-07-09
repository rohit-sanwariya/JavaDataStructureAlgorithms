package Interview.StringPractice;

import java.util.Arrays;

public class ReverseString {
    public String reverse(String s){
        char[] charAray = s.toCharArray();
        Arrays.sort(charAray);
        return new String(charAray);
    }
    public String sort(String s){
        char[] charAray = s.toCharArray();
        Arrays.sort(charAray);
        return new String(charAray);
    }
}
