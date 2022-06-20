package Interview.Array;

public class IsUnique {
    //All characters in string are unique
    //With Extra data structure
    public boolean isUniqueWithDataStructure(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsUnique isunique = new IsUnique();
        System.out.println(isunique.isUniqueWithDataStructure("helo"));
    }
    


}
