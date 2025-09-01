public class CountOfStringChar {

    public static void countOfString(String str){
        int noOfVowels=0;
        int noOfConsonants=0;
        int noOfWhiteSpaces=0;
        int noOfDigits=0;
        for (int i=0;i<str.length();i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
                noOfVowels += 1;
            else if(Character.isAlphabetic(str.charAt(i))&& str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u' && str.charAt(i)!='A' && str.charAt(i)!='E' && str.charAt(i)!='I' && str.charAt(i)!='O' && str.charAt(i)!='U' && str.charAt(i)!=' ')
                noOfConsonants += 1;
            else if(str.charAt(i)==' ')
                noOfWhiteSpaces += 1;
            else if(Character.isDigit(str.charAt(i)))
                noOfDigits += 1;
            else System.out.println("Inavlid character");
        }
        System.out.println("No of Vowels in the given String "+str+ " is : "+noOfVowels);
        System.out.println("No of Consonants in the given String "+str+ " is : "+noOfConsonants);
        System.out.println("No of white spaces in the given String "+str+ " is : "+noOfWhiteSpaces);
        System.out.println("No of digits in the given String "+str+ " is : "+noOfDigits);
    }



    public static void main(String[] args) {
        countOfString("Apple 743");
    }
}
