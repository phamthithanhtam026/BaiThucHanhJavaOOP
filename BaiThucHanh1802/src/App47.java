import java.util.Scanner;
public class App47 {
    public static void main(String args[]) throws Exception {
        int  Sum = 0;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        do {
            System.out.println("Nhap vao so nguyen bat ky: ");
            Sum += number;
        } while (Sum >= 100);
        System.out.println("Tong cac so nguyen vua nhap la: "+Sum);
    } 
}
