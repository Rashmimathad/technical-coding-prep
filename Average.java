public class Average {

    public static void calculateAverage(int arr[]){
        int sum=0;
        int avg=0;
        for (int i=0;i<arr.length;i++)
            sum += arr[i];
        avg=sum/ arr.length;
        System.out.println("Average of "+arr.length+" numbers is : "+avg);
    }

    public static void main(String[] args) {
        int arr[]={25,3,78,4,7,57,49};
        calculateAverage(arr);
    }
}
