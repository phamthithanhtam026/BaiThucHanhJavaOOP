import java.util.Scanner;
public class App8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0,number;
        float avgNumber;
        System.out.println("Nhập vào số phần tử có trong dãy số: ");
        n = scanner.nextInt();
        for(int count = 1;count<=n;count++){
            System.out.println("Nhập số thứ "+ count + ": ");
            number = scanner.nextInt();
            sum += number;
        }
        avgNumber = (float) sum/n;
        System.out.println("Trung bình cộng = "+avgNumber);
        scanner.close();
    }
    
}
