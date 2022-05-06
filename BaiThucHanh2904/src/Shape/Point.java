package Shape;

import java.util.Scanner;

public class Point {
    String tenDiem;
     double hoanhDo;
     double tungDo;
     // khởi tạo phương thức constructor có tham số
    public Point(String tenDiem, double hoanhDo, double tungDo){
        this.tenDiem = tenDiem;
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }
    // khởi tạo phương thức constructor không có tham số
    public Point(){

    }
    public String getTenDiem() {
        return tenDiem;
    }
    public void setTenDiem(String tenDiem) {
        this.tenDiem = tenDiem;
    }
    public double getHoanhDo() {
        return hoanhDo;
    }
    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }
    public double getTungDo() {
        return tungDo;
    }
    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten diem: ");
        tenDiem = scanner.nextLine();
        System.out.println("Nhap hoanh do: ");
        hoanhDo = scanner.nextDouble();
        System.out.println("Nhap tung do: ");
        tungDo = scanner.nextDouble();
    }
    public void in(){
        System.out.println("In toa do diem tren mat phang OXY: "+tenDiem + "(" + hoanhDo + " , "+ tungDo +")");
    }
}
