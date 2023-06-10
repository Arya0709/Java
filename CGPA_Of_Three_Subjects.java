//CGPA of marks out of 100 of three subjects
import java.util.Scanner;
public class CGPA_Of_Three_Subjects {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float sub1 = sc.nextFloat();
        float sub2 = sc.nextFloat();
        float sub3=sc.nextFloat();
        float CGPA=(sub1+sub2+sub3)/30;
        System.out.print("CGPA: "+CGPA);
    }
}
