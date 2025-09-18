import java.util.Arrays;

public class LargestSmallestInArray {

    public static void largestSmallestNumInArray(int[] arr){
        Arrays.sort(arr);
        System.out.println("Smallest Number in array is : "+arr[0]);
        System.out.println("Largest Number in array is : "+arr[arr.length-1]);
    }
    public static void main(String[] args) {
        int[] array={15,2,25,7,26,74,99,1};
        largestSmallestNumInArray(array);
    }
}
