
import java.util.*;
import java.text.*;

public class DateFormats {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat f2 = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat f3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        SimpleDateFormat f4 = new SimpleDateFormat("EEE MMMM dd HH:mm:ss z yyyy");
        SimpleDateFormat f5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        SimpleDateFormat f6 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat f7 = new SimpleDateFormat("w");
        SimpleDateFormat f8 = new SimpleDateFormat("W");
        SimpleDateFormat f9 = new SimpleDateFormat("D");

       
        System.out.println("Current date is : " + f1.format(now));
        System.out.println("Current date is : " + f2.format(now));
        System.out.println("Current date is : " + f3.format(now));
        System.out.println("Current date and time is : " + f4.format(now));
        System.out.println("Current date and time is : " + f5.format(now));
        System.out.println("Current time is : " + f6.format(now));
        System.out.println("Current week of year is : " + f7.format(now));
        System.out.println("Current week of month : " + f8.format(now));
        System.out.println("Current day of the year is : " + f9.format(now));
    }
}
