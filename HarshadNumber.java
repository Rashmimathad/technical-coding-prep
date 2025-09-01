public class HarshadNumber {

    public static void checkHarshadNumber(int num){
        int temp=num;
        int n=0;
        int sum=0;
        while(temp!=0){
            n=temp%10;
            sum += n;
            temp=temp/10;
        }
        if (num%sum == 0)
            System.out.println(num+" is a Harshad Number");
        else System.out.println(num+" is not a Harshad Number");
    }
    public static void main(String[] args) {
            checkHarshadNumber(18);
            checkHarshadNumber(15);
    }
}
