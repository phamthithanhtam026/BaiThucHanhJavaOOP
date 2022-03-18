import java.util.Scanner;
public class App3 {
    public static void main(String[] args) {
        String ten;
        int tuoi;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Nhập vào họ tên: ");
        ten = scanner.nextLine();
        System.out.println("Nhập vào tuổi: ");
         tuoi = scanner.nextInt();
         if(tuoi < 16){
             System.out.println("Bạn "+ten+" ở độ tuổi vị thành niên!");
         }
         else if(tuoi>=16 && tuoi < 18){
             System.out.println("Bạn "+ten+" ở độ tuổi trưởng thành!");
         }
         else{
             System.out.println("Bạn "+ten+" đã già!");
         }
         scanner.close();
    }
    
}
