import java.util.Scanner;
public class PhuongTrinhBac2 {
    private double a;
    private double b;
    private double c;
    public PhuongTrinhBac2(){

    }
    //Phương thức tạo lập
    public PhuongTrinhBac2(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void nhapPT(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        a = scanner.nextDouble();
        System.out.println("Nhap he so b: ");
        b = scanner.nextDouble();
        System.out.println("Nhap he so c: ");
        c = scanner.nextDouble();
    }
    //Phương thức nhập dữ liệu
    void giaiPT(){
        if(a==0){
            if(b!=0){
                double x;
                x = -c/b;
                System.out.println("Nghiem phương trinh: "+x);
            }
            else if(b==0){
                System.out.println("Phuong trinh khong hop le!");
            }
            else{
                double delta = b*b-4*a*c;
                if(delta<0){
                    System.out.println("Phuong trinh vo nghiem!");
                }else if(delta==0){
                    double x;
                    x = (-b)/(2*a);
                    System.out.println("Phuong trinh co nghiem kep"+x);
                }else{
                    double x1;
                    double x2;
                    x1 = (-b+Math.sqrt(delta))/(2*a);
                    x2 = (-b+Math.sqrt(delta))/(2*a);
                    System.out.println("Phuong trinh co nghiem phan biet:");
                    System.out.println("x1: "+x1);
                    System.out.println("x2: "+x2);
                }
                
            }
        }
    }
    public static void main(String[] args) throws Exception{
        PhuongTrinhBac2 ptb2 = new PhuongTrinhBac2();
        ptb2.nhapPT();
        ptb2.giaiPT();
    }
    
}
