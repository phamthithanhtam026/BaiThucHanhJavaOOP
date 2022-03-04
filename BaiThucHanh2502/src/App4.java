import java.util.Scanner;
public class App4 {
    boolean KiemTraNguyenTo(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    void inNguyenTo(int n){
        for(int i=1;i<n;i++){
            if(KiemTraNguyenTo(i)){
                System.out.println("  "+i);
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();
        App4 lk = new App4();
        lk.inNguyenTo(n);
    }
    
}
