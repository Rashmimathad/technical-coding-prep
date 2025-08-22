public class SumOfDigits {

    public static void sumOfDigits(int num){
        int temp=0;
        temp=num;
        int n=0;
        int sum=0;
        while(temp!=0){
            n=temp%10;
            sum += n;
            temp=temp/10;
        }
        System.out.println("Sum of digits of "+num+" is : "+sum);
    }

    public static void main(String[] args) {
        sumOfDigits(91);
        sumOfDigits(354);
        sumOfDigits(99);
    }
}
