import java.util.Scanner;
public class App10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int dem = 0;
        do{
            System.out.println("Nhap so nguyen duong n: ");
        } while(n<=0);
        while(n>=10){
            n/=10;
            dem++;
        }
        System.out.println("So luong chu so cua so nguyen duong la: "+dem+1);
    }
    
}
