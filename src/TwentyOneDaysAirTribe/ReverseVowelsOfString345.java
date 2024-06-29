package TwentyOneDaysAirTribe;

public class ReverseVowelsOfString345 {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        if(s.length() == 0){
            return s;
        }
        int l=0,r = s.length()-1;
        String vowels = "aeiou";
        while(l<=r){
            char cl = sb.charAt(l),cr = sb.charAt(r);
            boolean lv = vowels.contains(Character.toString(cl));
            boolean rv = vowels.contains(Character.toString(cr));
            if(lv && rv){
                sb.setCharAt(l,cr);
                sb.setCharAt(r,cl);
                l++;
                r--;
            }
            else if(lv && !rv){
                r--;
            }
            else{
                l++;
            }

        }
        return sb.toString();
    }
}
