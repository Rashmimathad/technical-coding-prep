public class SwapNumbers {


    public static void swap(int num1,int num2){
        System.out.println("Before Swap");
        System.out.println("Num1 : "+num1);
        System.out.println("Num2 : "+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swap");
        System.out.println("Num1 : "+num1);
        System.out.println("Num2 : "+num2);
    }

    public static void main(String[] args) {
        swap(35,2);
        System.out.println();
        swap(10,5);
        System.out.println();
        swap(20,15);
        System.out.println();
        swap(5,3);
    }
}
