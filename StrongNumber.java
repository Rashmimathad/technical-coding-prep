public class StrongNumber {

    public static void checkStrongNumber(int num) {
        int temp=num;
        int rem;
        int sum = 0;
        while (temp!=0){
            rem=temp%10;
            sum += factorial(rem);
            temp=temp/10;
        }
        if (num==sum)
            System.out.println(num+" is a Strong number");
        else System.out.println(num+" is not a Strong number");
    }

    public static int factorial(int rem) {
        int res=1;
        if (rem==0|| rem==1)
            return 1;
        else{
            for (int i=1;i<=rem;i++)
                res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        checkStrongNumber(145);
        checkStrongNumber(62);
    }

}
