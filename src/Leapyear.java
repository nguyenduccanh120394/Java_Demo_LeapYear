import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        System.out.println("Enter a year");
        int year ;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year%4==0&&year%100!=0){
            System.out.printf("The year %d is leap year",year);
        }else if (year%400!=0){
            System.out.printf("The year %d is not leap year",year);
        }else {
            System.out.printf("The year %d is leap year",year);
        }
    }
}

