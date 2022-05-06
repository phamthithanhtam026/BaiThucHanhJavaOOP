public class App72 {
    public class SinhVien{
        private String ten;
        private String tuoi;
        public String getTen(){
            return ten;
        }
        public void setTen(String ten){
            if(ten == null){
                this.ten = "Không biết"
            }
            else {
                this.ten = ten;
            }
        }
        public String getTuoi(){
            if(Integer.valueOf(tuoi)!=-1){
                return tuoi;
            }
            else{
                System.out.println("Tuổi không hợp lệ");
            }
        }
        public void setTuoi(int tuoi){
            if(tuoi>18){
                this.tuoi = String.valueOf(tuoi);
            }
            else{
                this.tuoi = String.valueOf(-1);
            }
        }

    }
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.setTen("");
        sv1.setTuoi(23);
        sv2.setTen("Peter");
        sv2.setTuoi(18);
        System.out.println("Sinh viên 1 có tên: "+sv1.getTen()+" và tuổi: "+sv1.getTuoi());
        System.out.println("Sinh viên 2 có tên: "+sv2.getTen()+" và tuổi: "+sv2.getTuoi());
    }
    
}
