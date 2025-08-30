public class PerfectNumber {

    public static void checkPerfectNumber(int num){
        int temp=num;
        int sum=0;
        if (temp>0){
            for (int i=1;i<temp;i++){
                if (temp%i==0)
                   sum += i;
            }
        }
        else System.out.println("Invalid input");

        if (num==sum)
            System.out.println(num+" is a perfect number");
        else System.out.println(num+" is not a perfect number");
    }

    public static void main(String[] args) {
        checkPerfectNumber(65);
        checkPerfectNumber(28);
    }
}
