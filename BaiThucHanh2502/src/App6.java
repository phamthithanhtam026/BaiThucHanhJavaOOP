import java.util.Scanner;
public class App6 {
    boolean KiemTraSoHoanHao(int n) {
        int sum = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;

    }
    void inSoHoanHao(int n){
        for(int i=1;i<n;i++){
            if(KiemTraSoHoanHao(i)){
                System.out.println("  "+i);
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap so nguyen duong n = ");
             n = scanner.nextInt();
        } while(n<=0);
        App6 lk = new App6();
        lk.inSoHoanHao(n);
        

    }
    
}
