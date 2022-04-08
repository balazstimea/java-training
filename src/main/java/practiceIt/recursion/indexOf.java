package practiceIt.recursion;

public class indexOf {
    public static void main(String[] args) {
        indexOf indexOf = new indexOf();

        System.out.println(indexOf("Barack Obama", "ck"));


    }
    public static int indexOf(String s1, String s2) {
        if (s1.length() == s2.length()) {
            if (s1.equals(s2)) {
                return 0;
            }

        } else if (s1.length()<s2.length()) {
            return -1;
        } else {
            String chars1=s1.substring(0, s2.length());
            if (chars1.equals(s2)) {
                return 0;

            }else {
                int result=1+indexOf(s1.substring(1), s2);
                if (result !=0)
                    return result;
            }
        }
        return -1;
        }
    }

