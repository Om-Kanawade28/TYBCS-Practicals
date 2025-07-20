import java.text.SimpleDateFormat;
import java.util.Date;
class Date_Format{
public static void main(String args[]){
Date d = new Date();


SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
String str = sdf.format(d);
System.out.println(" Current date:-"+str);

sdf = new SimpleDateFormat("MM-dd-yyyy");
str = sdf.format(d);
System.out.println(" Current date:-"+str);

sdf = new SimpleDateFormat("E MMMM dd yyyy");
str = sdf.format(d);
System.out.println(" Current date:-"+str);

sdf = new SimpleDateFormat("E MMMM H:m:s z yyyy");
str = sdf.format(d);
System.out.println(" Current date and time:-"+str);


sdf = new SimpleDateFormat("dd/MM/yy H:m:s a Z");
str = sdf.format(d);
System.out.println(" Current date and time:-"+str);

sdf = new SimpleDateFormat("H:m:s");
str = sdf.format(d);
System.out.println(" Current time is:-"+str);

sdf = new SimpleDateFormat("w");
str = sdf.format(d);
System.out.println(" Current week of year is:-"+str);

sdf = new SimpleDateFormat("W");
str = sdf.format(d);
System.out.println(" Current week of month:-"+str);

sdf = new SimpleDateFormat("D");
str = sdf.format(d);
System.out.println(" Current day of the year is :-"+str);
}}
/*
 Current date:-14/07/2025
 Current date:-07-14-2025
 Current date:-Mon July 14 2025
 Current date and time:-Mon July 16:32:21 IST 2025
 Current date and time:-14/07/25 16:32:21 PM +0530
 Current time is:-16:32:21
 Current week of year is:-29
 Current week of month:-3
 Current day of the year is :-195
*/ 
