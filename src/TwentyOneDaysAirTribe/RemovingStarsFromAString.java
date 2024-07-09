package TwentyOneDaysAirTribe;

public class RemovingStarsFromAString {
    String x ;
    public RemovingStarsFromAString(String xa){
        x =xa ;
    }
    public static  String removeStars(String s) {
        byte[] characters = "hel*lo".getBytes();
        int i = 0;
        for (byte c : characters){
            if(c == 42){
                i--;
            }
            else{
                characters[i] = c;
                i++;
            }
        }
        return new String(characters,0,i);
    }

    public static void main(String[] args) {
        removeStars("leet**cod*e");
    }
}
