public class App67 {
    public class HinhTron{
        public void XuatThongTin(){
            System.out.println("Đây là hình tròn!");
        }
    }
    
    public class HinhTru extends HinhTron {
        public void XuatThongTin(){
            System.out.println("Đây là hình trụ!");
        }
    }
    public static void main(String[] args) {
        HinhTron hinhtron = new HinhTron();
        HinhTru hinhtru = new HinhTru();
        hinhtron.XuatThongTin();
        hinhtru.XuatThongTin();

    }
}

