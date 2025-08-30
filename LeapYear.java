public class LeapYear {

    public static void checkLeapYear(int year){
        if (year%4==0 && year%100!=0 || year%100==0 && year%400==0)
            System.out.println(year+" is a leap year");
        else System.out.println(year+" is not a leap year");
    }



    public static void main(String[] args) {
        checkLeapYear(2000);
        checkLeapYear(2004);
        checkLeapYear(2005);
        checkLeapYear(2016);

    }
}
