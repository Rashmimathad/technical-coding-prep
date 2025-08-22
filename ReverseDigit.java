public class ReverseDigit {

    public static void reverseDigit(int num){
        int temp=num;
        int res=0;
        while (temp!=0){
            int rem=temp%10;
            res= res*10+rem;
            temp=temp/10;
        }
        System.out.println("Reverse of a digit "+num+ " is : "+res);
    }

    public static void main(String[] args) {
        reverseDigit(1234);
        reverseDigit(789);
        reverseDigit(13579);
    }
}
