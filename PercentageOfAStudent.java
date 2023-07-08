import java.util.Scanner;
public class PercentageOfAStudent {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the max marks for subject");
        float max=sc.nextFloat();
        System.out.println("Enter the marks obtained bt the student!!!");
        System.out.println("Enter subject1 marks");
        float s1=sc.nextFloat();
        System.out.println("Enter subject2 marks");
        float s2=sc.nextFloat();
        System.out.println("Enter subject3 marks");
        float s3=sc.nextFloat();
        System.out.println("Enter subject4 marks");
        float s4=sc.nextFloat();
        System.out.println("Enter subject5 marks");
        float s5=sc.nextFloat();
        if(max==100){
            System.out.println("The percentage is: "+((s1+s2+s3+s4+s5)/500)*100);
        }
        else if(max==80){
            System.out.println("The percentage is: "+((s1+s2+s3+s4+s5)/400)*100);
        }
    }
}