
import java.util.Scanner;

class CheckingDate{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Day: ");
        int day = scan.nextInt();
        System.out.print("Enter the Month: ");
        int month = scan.nextInt();
        System.out.print("Enter the Year: ");
        int year = scan.nextInt();


        if(day > 0 && day <= 31 && month > 0 && month <=12 && year > 0){
            System.out.println("Its a Valid Date");
        }else{
            System.out.println("Its a invalid date");
        }
    }
}