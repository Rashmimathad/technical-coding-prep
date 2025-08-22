public class FibonacciSeries {

    public static void fibonacciSeries(int n){
        int num1=0;
        int num2=1;
        int res;
        int count=0;
        if (n>0) {
            System.out.print("Fibonacci Series upto "+n+" terms is : " + num1 + "," + num2);
            while (count <= n-2) {
                res = num1 + num2;
                num1 = num2;
                num2 = res;
                count++;
                if (count <= n-2)
                    System.out.print("," + res);
            }
        }
        else System.out.println("Invalid Input");
    }

    public static void main(String[] args) {
        fibonacciSeries(9);
        System.out.println();
        fibonacciSeries(5);
        System.out.println();
        fibonacciSeries(7);
    }
}
