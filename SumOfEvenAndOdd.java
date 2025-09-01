public class SumOfEvenAndOdd {

    public static void sumOfEvenANdOddDigits(int num){
        int temp=num;
        int n=0;
        int sumOfEvenDigits=0;
        int sumOfOddDigits=0;
        while (temp!=0){
            n=temp%10;
            if (n%2==0)
                sumOfEvenDigits +=n;
            else
                sumOfOddDigits += n;
            temp=temp/10;
        }

        System.out.println("Sum of Even digits in "+num+" is : "+sumOfEvenDigits);
        System.out.println("Sum of Odd digits in "+num+" is : "+sumOfOddDigits);
    }

    public static void main(String[] args) {
        sumOfEvenANdOddDigits(1234);
    }
}
