import java.util.Scanner;
public class App5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean res;
        do{
            System.out.println("Nhap so nguyen duong n = ");
            n=scanner.nextInt();
        } while(n<=0);
        res = KiemTraSoHoanHao(n);
        if(res){
            System.out.println(n + "la so hoan hao");
        }
        else {
            System.out.println(n + "khong phai so hoan hao");
        }

    }
    public static boolean KiemTraSoHoanHao(int n){
        int sum = 0;
        for(int i=1;i<=n/2;i++) {
            if(n % i==0){
                sum+=i;
            }
        }
        return sum == n;
    }
    
}
