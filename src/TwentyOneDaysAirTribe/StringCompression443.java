package TwentyOneDaysAirTribe;

import java.util.HashMap;

public class StringCompression443 {
    public int compress(char[] chars  ) {
        if(chars.length <= 1){
            return chars.length;
        }
        char curr = chars[0];
        int count = 0 , j = 0 ;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(c == curr){
                count++;

            }
            else{

                if(count>1){
                    sb.append(curr);
                    sb.append(count);
                }
                else{
                    sb.append(curr);
                }
                curr = c;
                count= 1;
            }
        }
        if(count>1){
            sb.append(curr);
            sb.append(count);
        }
        else{
            if(count == 1){
                sb.append(curr);
            }
        }
        count = sb.length() ;
        while(j<count){
            chars[j] = sb.charAt(j);
            j++;
        }
        return count;
    }
}
