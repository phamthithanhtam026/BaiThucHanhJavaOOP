import java.util.Scanner;
public class App10 {
    public static void main(String[] args){
        String chuoi;
        char KyTu = '$';
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        for(int i=0;i<chuoi.length();i++){
            if(chuoi.charAt(i) == '$'){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự "+ KyTu +"trong chuỗi"+chuoi+"= "+count );
        scanner.close();

    }
    
}
