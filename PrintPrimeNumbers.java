public class PrintPrimeNumbers {

    public static boolean primeNumber(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2)
            return true;
        else
            return false;
}

    public static void main(String[] args) {
        int n=11;
        System.out.print("The prime numbers from 1 to "+n+ " are : ");
        for (int i=1;i<=n;i++){
            if(primeNumber(i))
                System.out.print(i+" ,");
        }
    }
}
