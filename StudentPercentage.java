import java.util.Scanner;
public class StudentPercentage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of 5 Subjects: ");
        System.out.print("Subject 1: ");
        float sub1=sc.nextFloat();
        System.out.print("Subject 2: ");
        float sub2=sc.nextFloat();
        System.out.print("Subject 3: ");
        float sub3=sc.nextFloat();
        System.out.print("Subject 4: ");
        float sub4=sc.nextFloat();
        System.out.print("Subject 5: ");
        float sub5=sc.nextFloat();
        System.out.print("Out of: ");
        float outOf=sc.nextFloat();
        float tot=outOf*5;
        float marksObtained=sub1+sub2+sub3+sub4+sub5;
        float percentage= (marksObtained/tot)*100;
        System.out.print("Percentage is: "+percentage+"%");
    }
}
