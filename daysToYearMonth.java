public class daysToYearMonth {
    public static void main(String[] args) {
        int d=1500;
        int y=d/365;
        int m=(d%365)/30;
        System.out.println(y+"years "+m+" months");
    }
    
}
