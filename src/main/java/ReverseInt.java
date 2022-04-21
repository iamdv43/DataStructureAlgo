import java.util.Arrays;

public class ReverseInt {



    public static void main(String args[]){

        int[] reverseInt = {1,2,3,4,5,6};

        reverseIt(reverseInt);
    }

    private static int[] reverseIt(int[] reverseInt) {

        int len = reverseInt.length;
        int temp;
        int[] reversedArray = new int[len];

        for(int i = 0; i < len; i++){

            temp = reverseInt[i];
            reversedArray[i] = reverseInt[len-1];
            reversedArray[len-1] = temp;
            len--;
        }

        System.out.println("ReveredArray: " + Arrays.toString(reversedArray));
        return reversedArray;
    }

}
