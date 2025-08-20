public class PrimeNumOrNot {

    public static void primeOrNot(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if (num%i==0 || num%i==i)
                count += 1;
        }
        if (count==2)
            System.out.println(num+" is prime number");
        else
            System.out.println(num+" is not a prime number");

    }


    public static void main(String[] args) {
        primeOrNot(7);
        primeOrNot(15);
        primeOrNot(21);
        primeOrNot(20);
        primeOrNot(131);
    }
}
