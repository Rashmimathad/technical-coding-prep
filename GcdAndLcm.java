public class GcdAndLcm {

    public static int findGcd(int num1,int num2){
        while (num2>0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int findLcm(int num1,int num2){
        int res= (num1*num2)/findGcd(num1,num2);
        return res;
    }
    public static void main(String[] args) {
        int num1=6;
        int num2=8;
        System.out.println("The Lcm of "+num1+" and "+num2+" is : "+findLcm(num1,num2));
        System.out.println("The Gcd of "+num1+" and "+num2+" is : "+findGcd(num1,num2));
    }
}
