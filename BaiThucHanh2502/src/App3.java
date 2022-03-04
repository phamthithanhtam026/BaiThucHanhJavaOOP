import java.util.Scanner;
public class App3 {
        
        boolean kiemtranguyento(int n){
            if(n<=1){
                return false;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    
    
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println("Kiem tra so nguyen to");
            System.out.println("Nhap so nguyen duong: ");
            int n = s.nextInt();
            App3 snt = new App3();
            if(snt.kiemtranguyento(n)){
                System.out.println("So: "+n +"la so nguyen to");
            }
            else{
                System.out.println("So: "+n +"khong phai la so nguyen to");
            }
        }
    }
    

