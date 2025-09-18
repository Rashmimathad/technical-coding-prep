import java.util.Scanner;

public class ArrayManipulation {

    public static int[] moveZerosToEnd(int[] arr){
        int size=arr.length;
        int[] temp=new int[size];
        int j=0;
        for (int i = 0; i <temp.length ; i++) {
            if (arr[i]!=0)
                temp[j++]=arr[i];
        }
        while (j<temp.length)
            temp[j++]=0;

        return temp;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the each element for array of size "+size+" : ");
        for (int i=0;i< arr.length;i++) {
         arr[i]=sc.nextInt();
        }
        System.out.println("Array after zeros pushed to end : ");
        for (int i=0;i<moveZerosToEnd(arr).length;i++){
                System.out.print(moveZerosToEnd(arr)[i]+" ");
        }
    }

}
