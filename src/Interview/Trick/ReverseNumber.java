package Interview.Trick;

public class ReverseNumber {
    public static int reverse(int x){
        int y = 0;
        while(x>0){
            y = y*10 + x%10 ;
            x = Math.floorDiv(x,10);
        }
        return y;
    }

    public static void main(String[] args) {
        reverse(1234);
    }
}
