import java.util.Scanner;
public class App30 {
    public static void main(String[] args) throws Exception {
        int n, m, Sum = 0;
        Scanner scanner = new Scanner(System.in);
        n =  scanner.nextInt();
        do{
            System.out.println("Nhập vào số nguyên dương bất kỳ: ");
        } while(n <= 0);
        m = n % 10;
        n = n / 10;
        Sum += m;
    }
    System.out.println("Tổng các chữ số là = "+Sum);
}
