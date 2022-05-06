import java.util.Scanner;
public class App77 {
    public static final int SO_LUONG_HINH_TOI_THIEU = 0;
    public static final int SO_LUONG_HINH_TOI_DA = 5;
    public static final float PI = 3.14f;
    public static final float INCH_CM = 2.54f;
    public static final int DON_VI_CM = 1;
    public static final int DON_VI_INC = 2;
    public static int donVi = DON_VI_CM;
    public static float ChuyenCentimetSangInch(float cm){
        float inch = cm/INCH_CM;
        return inch;
    }
    public static float ChuyenInchSangCentimet(float inch){
        float cm = inch*INCH_CM;
        return cm;
    }
    public class HinhTron extends HinhHoc{
        protected float bankinh;
        private Scanner scanner;
        public HinhTron(){
            super();
            Scanner scanner = new Scanner(System.in);
        }
        public void NhapBanKinh(){
            System.out.println("Bạn dùng đơn vị tính nào: ");
            System.out.println("--Centimet--");
            System.out.println("Inch");
            System.out.println("Nhập bán kính của đường tròn");
            bankinh = scanner.nextFloat();
        }
        public void InThongTin(){
            System.out.println("Hình tròn có bán kính "+bankinh+ "cm: ");
            System.out.println();
        }
    }
    
}
