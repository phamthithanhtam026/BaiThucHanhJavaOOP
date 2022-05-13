import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashsetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        // thêm các phần tử vào trong hashsetInteger
        hashsetString.add("Wilson");
        hashsetString.add("Nike");
        hashsetString.add("Volvo");
        hashsetString.add("Kia");
        hashsetString.add("Lenovo");
        hashsetString.add("Lenovo");
        // hiển thị ra các phần tử trong hashsetString
        System.out.println("Cac phan tu trong hashsetString: ");
        System.out.println(hashsetString);
        System.out.println("Nhap phan tu can xoa: ");
        name = scanner.nextLine();
        if(hashsetString.contains(name)){
            hashsetString.remove(name);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu trong hashsetString: ");
            System.out.println(hashsetString);
        }else{
            System.out.println("Xoa khong thanh cong!");
        }


    }
    
}
