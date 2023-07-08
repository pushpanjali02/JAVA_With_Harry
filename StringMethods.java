import java.sql.SQLOutput;
import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String s=sc.nextLine();
        System.out.println("Using length method to find length of a string:"+s.length());
        System.out.println("Using trim method to remove spaces in a string:"+s.trim());
        System.out.println("Using toLowerCase method to convert into lower case:"+s.toLowerCase());
        System.out.println("Using toUpperCase method to convert into upper case:"+s.toUpperCase());
        System.out.println("Using substring method to return a substring:"+s.substring(5));
        System.out.println(s.substring(2,9));
        System.out.println("Using replace method to replace a character or a series of charcters with the specified character or string:"+s.replace('a','p'));
        System.out.println(s.replace("pushpanjali","prabhasini"));
        System.out.println("Enter another string");
        String s2=sc.nextLine();
        System.out.println("String after Concatenation is :"+s.concat(s2));
       // System.out.println("MIN value of integer data type is: "+Byte.MIN_VALUE);
        System.out.println("using indexof method: "+s.indexOf("push"));
        System.out.println("using character at method"+s.charAt(2));
    }
}
