import java.util.Scanner;
public class App{
    public static void main(String[] args) throws Exception{
        Scanner scanner=new Scanner(System.in);
        //khai bao cac bien
        double a=scanner.nextDouble();
        System.out.println("Nhap gia tri a: "+a);
        double b=scanner.nextDouble();
        System.out.println("Nhap gia tri b: "+b);
        double c=scanner.nextDouble();
        System.out.println("Nhap gia tri c: "+c);
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Phuong trinh co vo so nghiem! ");
                } else{
                    System.out.println("Phuong trinh vo nghiem! ");
                }
                
                }else{
                    double x = (double)(-b)/c;
                    System.out.println("Phuong trinh co 1 nghiem la: "+x);
                }
            }
            else{
                double delta = b*b - 4*a*c;
                if(delta < 0 ){
                    System.out.println("Phuong trinh vo nghiem! ");
                }
                else if(delta == 0){
                    System.out.println("Phuong trinh co 1 nghiem la: "+(-b)/(2*a));
                }
                else{
                    double x1 = (double) (((-b)+Math.sqrt(delta))/2*a);
                    double x2 = (double) (((-b)+Math.sqrt(delta))/2*a);
                    System.out.println("Phuong trinh co nghiem x1 = "+x1);
                    System.out.println("Phuong trinh co nghiem x2 = "+x2);
                }
            }
        }
    }
    
