import java.util.Scanner;
public class App4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int thang = scanner.nextInt();
        switch(thang){
            case 1:
            System.out.println("Tháng một!");
            break;
            case 2:
            System.out.println("Tháng hai!");
            break;
            case 3:
            System.out.println("Tháng ba!");
            break;
            case 4:
            System.out.println("Tháng tư!");
            break;
            case 5:
            System.out.println("Tháng năm!");
            break;
            case 6:
            System.out.println("Tháng sáu!");
            break;
            case 7:
            System.out.println("Tháng bảy!");
            break;
            case 8:
            System.out.println("Tháng tám!");
            break;
            case 9:
            System.out.println("Tháng chín!");
            break;
            case 10:
            System.out.println("Tháng mười!");
            break;
            case 11:
            System.out.println("Tháng mười một!");
            break;
            case 12:
            System.out.println("Tháng mười hai!");
            break;
            default:
           
            System.out.println("Nhập sai số tháng. Mời nhập lại!");
        }
        scanner.close();
    }
    
}
