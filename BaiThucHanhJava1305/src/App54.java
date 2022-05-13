import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashsetInteger = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        // thêm phần tử vào hashsetInteger
        hashsetInteger.add(0);
        hashsetInteger.add(3);
        hashsetInteger.add(1);
        hashsetInteger.add(4);
        hashsetInteger.add(2);
        hashsetInteger.add(8);
        // hiển thị phần tử trong hashsetInteger
        System.out.println("Cac phan tu trong hashsetInteger: ");
        System.out.println(hashsetInteger);
        System.out.println("Nhap phan tu can them: ");
        number = scanner.nextInt();
        if(!hashsetInteger.contains(number)){
            hashsetInteger.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong hashsetInteger sau khi them: ");
            System.out.println(hashsetInteger);
        }else{
            System.out.println("Phan tu "  + number + " da ton tai");
        }
    }
    
}
