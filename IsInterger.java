import java .util.Scanner;
public class IsInterger {
    public static void main(String [] arg){
        Scanner read=new Scanner(System.in);
        System.out.println("To check if entered number is integer: ");
        System.out.print("Enter number: ");
        System.out.println(read.hasNextInt());
    }
}
