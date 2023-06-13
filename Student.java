import java.util.Scanner;
public class Student {
    private int studentId;
    private String name;
    private char residentialStatus;
    private int yearOfEngg;
    private float qualifyingExamMarks;
    public int getStudentId(){
        Scanner sc =new Scanner(System.in);
        studentId = sc.nextInt();
        return studentId;
    }
    public void setStudentId(int studentId){
        System.out.println("ID: "+studentId);
    }
    public String getName(){
        Scanner sc =new Scanner(System.in);
        name= sc.next();
        return name;
    }
    public void setName(String name){
        System.out.println("Name: "+name);
    }
    public float getQualifyingExamMarks(){
        Scanner sc =new Scanner(System.in);
        qualifyingExamMarks = sc.nextFloat();
        return qualifyingExamMarks;

    }
    public void setQuaifyingExamMarks(float qualifyingExamMarks){
        System.out.println("Qualifying Marks: "+qualifyingExamMarks);
    }
    public char getResidentialStatus(){
        Scanner sc =new Scanner(System.in);
        residentialStatus = sc.next().charAt(0);
        return residentialStatus;

    }
    public void setResidentialStatus(char residentialStatus){
        if(residentialStatus == 'H' || residentialStatus == 'h')
            System.out.println("Residential Status: Hostellers");
        else if((residentialStatus == 'D' || residentialStatus == 'd'))
            System.out.println("Residential Status: Day Scholar");
        else {
            System.out.println("Residential Status: Invalid Entry ");
        }
    }
    public int getYearOfEngg(){
        Scanner sc =new Scanner(System.in);
        yearOfEngg=sc.nextInt();
        return yearOfEngg;
    }
    public void setYearOfEngg(int yearOfEngg){
        System.out.println("Year of Engineering: "+yearOfEngg);

    }
    public static void main(String[] args){
        Student st = new Student();
        System.out.print("Id: ");
        st.getStudentId();
        System.out.print("name: ");
        st.getName();
        System.out.print("Residential Status: ");
        st.getResidentialStatus();
        System.out.print("Qualifying Marks: ");
        st.getQualifyingExamMarks();
        System.out.print("Year of Engineering: ");
        st.getYearOfEngg();

        System.out.println();
        System.out.println("Output: ");

        st.setStudentId(st.studentId);
        st.setName(st.name);
        st.setResidentialStatus(st.residentialStatus);
        st.setQuaifyingExamMarks(st.qualifyingExamMarks);
        st.setYearOfEngg(st.yearOfEngg);

    }
}
