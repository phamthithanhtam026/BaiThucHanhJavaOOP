import java.util.Scanner;
public class HinhTron {
    double chuvi,dientich;
    Scanner scanner = new Scanner(System.in);
    final float PI = 3.14f;
    double r = scanner.nextDouble();
   public void NhapBanKinh(){
       System.out.println("Nhap ban kinh hinh tron: ");
       double r = scanner.nextDouble();
   }
   public void InBanKinh(){
       System.out.println("Ban kinh hinh tron la: "+r);
   }
   public void TinhChuVi(){
       chuvi = 2*r*PI;
       System.out.println("Chu vi hinh tron la: "+chuvi);
   }
   public void TinhDienTich(){
       dientich = Math.pow(r,2)*r;
   }
    public static void main(String[] args) throws Exception {
        HinhTron ht = new HinhTron();
        ht.NhapBanKinh();
        ht.InBanKinh();
        ht.TinhChuVi();
        ht.TinhDienTich();
    }
}
