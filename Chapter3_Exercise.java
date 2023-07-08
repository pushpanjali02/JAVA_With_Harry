import java.util.Scanner;
public class Chapter3_Exercise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //program to convert into lowercase
        System.out.println("Enter a string: ");
        String s1=sc.nextLine();
        System.out.println("String in lower case is: "+s1.toLowerCase());
        //program to replace spaces with underscores
        System.out.println("String after replacing spaces with underscores is: "+s1.replace(" ","_"));
        //inserting your name in a predefined string
        System.out.println("Enter your name");
        String s2=sc.nextLine();
        String s3="Hey <name>!!! How are you";
        System.out.println("New statement is: "+s3.replace("<name>",s2));
        //Detecting double spaces and single spaces
        System.out.println("Enter a sentence with double and triple or any number of spaces");
        String s4=sc.nextLine();
        if(s4.indexOf("  ")!=-1){
            System.out.println("has double spaces");
        }
        else{
            System.out.println("Doesn't have double spaces");
        }
//        System.out.println("Index of double spaces: "+s4.indexOf("  "));
//        System.out.println("Index of triple spaces: "+s4.indexOf("   "));
        //using escape sequences
        System.out.println("Hiii\neveryone\t how are you");

    }
}
