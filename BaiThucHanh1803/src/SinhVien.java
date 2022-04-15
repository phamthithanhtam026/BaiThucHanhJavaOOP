import java.util.Scanner;
public class SinhVien {
    Scanner scanner = new Scanner(System.in);
    //khai báo các thuộc tính cần thiết
    private String MaSV;
    private String HoTen;
    private String Gioitinh;
    private String Diachi;
    public void Nhap(){
        System.out.println("Nhap ma sinh vien: ");
        MaSV = scanner.nextLine();
        System.out.println("Nhap ho ten sinh vien: ");
        HoTen = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        Gioitinh = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        Diachi = scanner.nextLine();
    }
    public void In(){
        System.out.printf("6%s 10%s 20%s 20%s \n","Ma sinh vien","Ho va ten","gioi tinh","dia chi");
    }
    public static void main(String[] args) throws Exception{
        SinhVien sv = new SinhVien();
        sv.Nhap();
        sv.In();
    }

    
}
