public class ArmstrongNumOrNot {

    public static void armstrongOrNot(int num){
        int count=0;
        int temp,temp1,sum=0;
         temp=num;
         temp1=num;

        while(temp!=0){
            count += 1;
            temp=temp/10;
        }

        while(temp1!=0){
            int n=temp1%10;
            sum= (int) (sum+Math.pow(n,count));
            temp1=temp1/10;
        }

        if (sum==num)
            System.out.println(num+" is an Armstrong number");
        else System.out.println(num+" is not an Armstrong number");
    }

    public static void main(String[] args) {

        armstrongOrNot(153);
        armstrongOrNot(123);
    }
}
