import java.util.Scanner;
public class StringExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First name: ");
        String name = sc.next();
        System.out.print("Hello " + name + ", have a good day.");
    }
}
