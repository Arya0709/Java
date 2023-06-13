import java.util.Scanner;
public class RetailStore {
    int billId;
    int customerId;
    int discount;
    double billAmount;
    double discountedBillAmount;
    public void getDetails(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Bill ID: ");
        billId=sc.nextInt();
        System.out.print("Customer Id: ");
        customerId=sc.nextInt();
        System.out.print("Discount: ");
        discount=sc.nextInt();
        System.out.print("Bill Amount: ");
        billAmount=sc.nextDouble();
    }
    public double totBill(double billAmount){
        discountedBillAmount = (double) billAmount - (billAmount* (discount/100.0));
        return discountedBillAmount;
    }
    public void printBill(){
        System.out.println("Bill ID: "+billId);
        System.out.println("Customer ID: "+customerId);
        System.out.println("Bill Amount: "+ billAmount);
        System.out.println("Discount: "+discount);
    }
    public static void main(String [] args){
        RetailStore Rs = new RetailStore();
        Rs.getDetails();
        System.out.println();
        System.out.println("Bill: ");
        Rs.printBill();
        System.out.print("Total Bill: "+Rs.totBill(Rs.billAmount));

    }
}
