import java.util.Scanner;
public class App2 {
    void KiemTraTamGiac(float a, float b, float c){
        if(a+b<=c||a+c<=b||b+c<=a){
            System.out.println("Tam giac khong hop le.Xin kiem tra lai!");

        }
        else{
            System.out.println("Day la tam giac: ");
            if((a==b)&&(b==c)){
                System.out.println("Deu");
            }
            else if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a){
                System.out.println("Vuong");
            }
            else if((a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a)&&(a==b||b==c||a==c)){
                System.out.println("Vuong can");
            }
            else if(a==b||a==c||b==c){
                System.out.println("Can")
            }
            else{
                System.out.println("Thuong");
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri canh thu nhat: ");
        float a = scanner.nextFloat();
        System.out.println("Nhap gia tri canh thu hai: ");
        float b = scanner.nextFloat();
        System.out.println("Nhap gia tri canh thu ba: ");
        float c = scanner.nextFloat();
        App2 tamgiac = new App2();
        tamgiac.KiemTraTamGiac(a,b,c);
    }

}
