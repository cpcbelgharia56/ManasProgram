import java.util.Scanner;

public class secondsToMinsHours {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int s;
        System.out.println("enter the number of seconds:4 ");
        s=sc.nextInt();

        int h=s/3600;
        int m=(s%3600)/60;
        System.out.println(h+" hours "+m+" minutes");

        sc.close();
    }
    
}
