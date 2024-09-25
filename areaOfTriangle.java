import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double base;
        System.out.println("enter base:");
        base=sc.nextDouble();
        double height;
        System.out.println("enter height:");
        height=sc.nextDouble();
        double area=(1.0/2.0)* base * height ;
        System.out.println("area of triangle "+area);
        sc.close();
    }
}
