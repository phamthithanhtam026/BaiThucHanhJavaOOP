public class App75 {
    public class HinhHoc{
        public static int dem = 0;
        public HinhHoc(){
            dem++;
        }
        public class HinhTron extends HinhHoc{
            public HinhTron(){
                super();
            }
        }
        public class HinhChuNhat extends HinhHoc{
            public HinhChuNhat(){
                super();
            }
        }
    }
    public static void main(String[] args) {
        HinhHoc hinhhoc = new HinhHoc();
        HinhTron hinhtron = new HinhTron();
        HinhChuNhat hinhchunhat = new HinhChuNhat();
        System.out.println("Có tất cả "+HinhHoc.dem+" hình trong ứng dụng");
    }
    
}
