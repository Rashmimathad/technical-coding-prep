public class ReverseString {

    public static void reverseString(String str){
        System.out.print("Reverse of string "+str+" is :");
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }


    }

    public static void main(String[] args) {
        reverseString("Rashmi");
        System.out.println();
        reverseString("apple");
    }
}
