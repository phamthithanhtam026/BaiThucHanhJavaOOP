import java.util.Scanner;
public class App2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //khai bao cac bien
        double a1=nextDouble();
        System.out.println("Nhap gia tri a1 : "+a1);
        double b1=nextDouble();
        System.out.println("Nhap gia tri b1 : "+b1);
        double c1=nextDouble();
        System.out.println("Nhap gia tri c1 : "+c1);
        double a2=nextDouble();
        System.out.println("Nhap gia tri a2 : "+a2);
        double b2=nextDouble();
        System.out.println("Nhap gia tri a2 : "+b2);
        double c2=nextDouble();
        System.out.println("Nhap gia tri a2 : "+c2);
        double D = a1*b2-a2*b1;
        double Dx = c1*b2-c2*b1;
        double Dy = a1*c2-a2*c1;
        if(D==0){
            if(Dx=Dy=0){
                System.out.println("Phuong trinh co vo so nghiem!");
            } else{
                System.out.println("Phuong trinh vo nghiem!");
            }
        }
        else{
            double x = (double) (Dx)/D;
            System.out.println("Phuong trinh co 1 nghiem duy nhat x: "+x);
            double y = (double) (Dy)/D;
            System.out.println("Phuong trinh co 1 nghiem duy nhat y: "+y);
        }
    }
}