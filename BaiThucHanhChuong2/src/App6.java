import java.util.Scanner;
public class App6 {
    public static void main(String[] args){
        int n, temp=1;
        long giaithua=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số n: ");
        n = scanner.nextInt();
        while((n<=0)||(n>10)){
            System.out.println("Nhập lại số n: ");
            n = scanner.nextInt();
        }
        while(temp<=n){
            giaithua *= temp;
            temp++
        }
        System.out.println(n + "! = "+giaithua);
        scanner.close();
        
    }
    
}
