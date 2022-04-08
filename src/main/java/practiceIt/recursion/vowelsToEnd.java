package practiceIt.recursion;

public class vowelsToEnd {
    public static void main(String[] args) {
        vowelsToEnd vowelsToEnd = new vowelsToEnd();

        //System.out.println(vowelsToEnd("beautifully"));


    }
  //  public static String vowelsToEnd(String s, String newVowels) {
    //    if (s.length()<=1){
      //      return s;


        //}

    //}



    public boolean hasVowels(String newVowels) {
        for (int i = 0; i < newVowels.length(); i++) {
            if (newVowels.charAt(i) == 'a' || newVowels.charAt(i) == 'e' || newVowels.charAt(i) == 'i' || newVowels.charAt(i) == 'o' || newVowels.charAt(i) == 'u') {
                return true;
            } else {
                return false;
            }
        }
return false;
    }}
