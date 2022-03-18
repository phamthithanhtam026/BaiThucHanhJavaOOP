import java.util.Scanner;
public class App2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị của một số: ");
        int a = scanner.nextInt();
        if(a % 2==0){
            System.out.println("Số vừa nhập là số chẵn!");
        }
        else{
            System.out.println("Số vừa nhập là số lẻ!");
        }
        scanner.close();
    }
}
