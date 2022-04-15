package SHAPES;
import java.util.Scanner;
public class HinhVuong {
    Scanner scanner = new Scanner(System.in);
    double chieudaicanh;
    double chuvi,dientich;
    public void Nhap(){
        System.out.println("Nhap chieu dai canh : ");
        chieudaicanh = scanner.nextDouble();
    }
    public void In(){
        System.out.println("Chieu dai canh vua nhap la: "+chieudaicanh);
    }
    public void TinhChuVi(){
        chuvi = chieudaicanh*4;
        System.out.println("Chu vi hinh vuong la: "+chuvi);
    }
    public void TinhDienTich(){
        dientich = Math.pow(chieudaicanh,2);
        System.out.println("Dien tich hinh vuong la: "+dientich);
    }
    public static void main(String[] args) throws Exception{
        HinhVuong HV = new HinhVuong();
        HV.Nhap();
        HV.In();
        HV.TinhChuVi();
        HV.TinhDienTich();

    }
    
}
