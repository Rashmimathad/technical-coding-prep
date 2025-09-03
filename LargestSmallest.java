public class LargestSmallest {

    public static void checkLargestSmallest(int num){
        int temp=num;
        int rem=0;
        int largestNumber=0;
        int smallestNumber=9;
        while (temp!=0) {
            rem = temp % 10;
            if(rem>largestNumber)
                largestNumber=rem;
            if (rem<smallestNumber)
                smallestNumber=rem;
            temp=temp/10;
        }
        System.out.println("Largest digit in "+num+" is : "+largestNumber);
        System.out.println("Smallest digit in "+num+" is : "+smallestNumber);
    }

    public static void main(String[] args) {
        checkLargestSmallest(9172);
    }
}
