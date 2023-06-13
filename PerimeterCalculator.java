class Rectangle {
    private int length = 4;//instace variable
    private int breadth = 6;//instance variable
    public int calculatePerimeter(){
        int perimeter= 2*(length+breadth);
        return perimeter;
    }
}
public class PerimeterCalculator{
    public static void main(String args[]){
        Rectangle rect= new Rectangle();
        int peri=rect.calculatePerimeter();
        System.out.println("Perimeter: "+peri);
    }
}
