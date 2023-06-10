import java.util.Scanner;
public class KiloToMile {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter kilometers: ");
        double kilo=sc.nextFloat();
        double mile= kilo * 0.62137119;
        System.out.print("Miles: "+mile);
    }
}
