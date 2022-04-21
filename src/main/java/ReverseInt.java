import java.util.Arrays;

public class ReverseInt {

    public static void main(String args[]){

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString( reverseIt(new int[]{1, 2, 3, 4, 5, 6})));
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Total run time: " + totalTime);

    }

    private static int[] reverseIt(int[] reverseInt) {

        int len = reverseInt.length - 1;
        int temp;
        int start = 0;

        while(start < len){
            temp = reverseInt[start];
            reverseInt[start] = reverseInt[len];
            reverseInt[len] = temp;
            start++;
            len--;
        }

        return reverseInt;
    }

}
