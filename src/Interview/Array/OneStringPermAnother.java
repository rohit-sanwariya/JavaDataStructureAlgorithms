package Interview.Array;

public class OneStringPermAnother {
    public boolean OneStringPermAnotherCheck(String one,String two){
        if(one.length() != two.length()){
            return false;
        } else {
            for (char c:one.toCharArray()) {
               if(!two.contains(String.valueOf(c))){
                   return false;
               }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        OneStringPermAnother oneStringPermAnother = new OneStringPermAnother();
        System.out.println( oneStringPermAnother.OneStringPermAnotherCheck("abcd","cab")
        );
        
    }
}
