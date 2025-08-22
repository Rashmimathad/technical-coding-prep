public class Palindrome {

    public static void checkPalindrome(int num){
        int temp=num;
        int res=0;
        while (temp!=0){
            int rem=temp%10;
            res= res*10+rem;
            temp=temp/10;
        }

        if (res==num)
            System.out.println(num+" is a palindrome");
        else
            System.out.println(num+" is not a palindrome");

    }

    public static void main(String[] args) {
        checkPalindrome(212);
        checkPalindrome(512);
        checkPalindrome(121);
    }
}
