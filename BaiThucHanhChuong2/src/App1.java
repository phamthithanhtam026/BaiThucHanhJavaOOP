import java.util.Scanner;
public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int b = sc.nextInt();
        // tính tổng hai số
        int tong = a + b;
        System.out.println("Tổng hai số là: "+tong);
        // tính hiệu hai số
        int hieu = a - b;
        System.out.println("Hiệu hai số là: "+hieu);
        //tính tích hai số 
        int tich = a*b;
        System.out.println("Tích hai số là: "+tich);
        //tính thương hai số
        float thuong = (float) a/b;
        System.out.println("Thương hai số là: "+thuong);
        //chia lấy dư
        int phandu = a % b;
        System.out.println("Chia lấy phần dư là: "+phandu);
        // so sánh hai số
        if(a<b){
            System.out.println("Số "+a+" nhỏ hơn số"+ b);
        }
        else if(a>b){
            System.out.println("Số "+a+" lớn hơn số"+ b);
        }
        else{
            System.out.println("Hai số bằng nhau");
        }
        sc.close();
    }
}
