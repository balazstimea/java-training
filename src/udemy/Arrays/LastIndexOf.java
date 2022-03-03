package udemy.Arrays;

public class LastIndexOf {

    public static void main(String[] args){
        System.out.println(lastIndexOf(new int[]{74, 85, 102, 99, 101, 85, 56}, 85));
        System.out.println(lastIndexOf(new int[]{74, 85, 102, 99, 101, 85, 56}, 58));
    }

    public static int lastIndexOf (int[] array, int value){
        int lastIndex=0;
        int count=0;
        for(int i=0; i<array.length; i++){
            if(array[i]==value) {
                lastIndex = i;
                count++;
            }
        }
        if (count==0)
            return -1;
        else
            return lastIndex;
    }
}
