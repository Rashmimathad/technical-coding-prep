public class ReverseEachWordOfString {


    public static void reverseEachWordOfString(String str){
        String[] strArr=str.split(" ");
        for (int i= strArr.length-1;i>=0;i--){
            System.out.print(strArr[i]+" ");
        }
    }
    public static void main(String[] args) {
        reverseEachWordOfString("My Name is Rashmi");
    }
}
