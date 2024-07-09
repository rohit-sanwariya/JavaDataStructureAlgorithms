package TwentyOneDaysAirTribe;

public class ValidPallindrom125 {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            else {
                l++;
                r--;

            }


        }
        return true;
    }
}
