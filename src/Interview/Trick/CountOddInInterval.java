package Interview.Trick;

public class CountOddInInterval {

        public static int countOdds(int low, int high) {
            if(low%2==0){
                low++;
            }
            if(high%2==0){
                high--;
            }
            return ((high-low)/2)+1;
        }

    public static void main(String[] args) {
        System.out.println(countOdds(8,10));
    }
    }

