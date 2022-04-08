package practiceIt.recursion;

public class isReverse {
    public static void main(String[] args) {
        isReverse isReverse = new isReverse();

        System.out.println(isReverse("hello", "olleha"));


    }
    public static boolean isReverse(String s1, String s2) {
        if (s1.length()==0 && s2.length()==0) {
            return true;

        } else if (s1.length()!=s2.length()) {
            return false;
        } else {
            char char1= Character.toUpperCase(s1.charAt(0));
            char char2 = Character.toUpperCase(s2.charAt(s2.length() - 1));
            if (char1==char2) {
                return isReverse(s1.substring(1), s2.substring(0, s2.length()-1));
            }else {
                return false;
            }
        }
        }
    }

