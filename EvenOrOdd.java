public class EvenOrOdd {

    public static void evenOrOdd(int num){
        if (num%2==0)
            System.out.println(num+" is an even number");
        else System.out.println(num+" is an odd number ");
    }

    public static void main(String[] args) {
        evenOrOdd(22);
        evenOrOdd(25);
        evenOrOdd(40);
        evenOrOdd(15);
    }
}
