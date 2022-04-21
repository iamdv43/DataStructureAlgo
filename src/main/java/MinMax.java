import java.util.Arrays;

public class MinMax {

    public static int[] findMinMax(int[] arr){
        int[] minMax = new int[2];

        int arrLen = arr.length;

        if(arrLen > 0){
            minMax[0] = arr[0];
            minMax[1] = arr[0];
        }else{
            return minMax;
        }

        for(int i = 0; i < arrLen; i++){
            if(minMax[0] > arr[i]){
                minMax[0] = arr[i];
            }
            if(minMax[1] < arr[i]){
                minMax[1] = arr[i];
            }
        }

        return minMax;
    }

    public static void main(String args[]) {
        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(findMinMax(new int[]{99,949, 494, 1,-16, 5, 99})));
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Total run time: " + totalTime);


    }

}
