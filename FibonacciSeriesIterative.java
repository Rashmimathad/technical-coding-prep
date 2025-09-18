public class FibonacciSeriesIterative {


    public  static int fibonacciSeries(int n){
        if (n<=1)
            return n;
        else return fibonacciSeries(n-1)+fibonacciSeries(n-2);
    }
    public static void main(String[] args) {
          int n=7;
        System.out.println("Fibonacci Series upto "+n +" terms :");
        for (int i=0;i<n;i++)
            System.out.print(fibonacciSeries(i)+" ");
    }
}
