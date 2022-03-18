import java.util.Scanner;
public class App9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String chuoi;
        int count=0;
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        for(int i=0;i<chuoi.length();i++){
            if(chuoi.charAt(i) >=65&&chuoi.charAt(i)<=90){
                count++;
            }
        }
        System.out.println("Có "+ count +" ký tự hoa trong chuỗi");
        for(int i=0;i<chuoi.length();i++){
            if(chuoi.charAt(i) >=97&&chuoi.charAt(i)<=122){
                count++;
            }
        }
        System.out.println("Có "+ count +"ký tự thường trong chuỗi");
        for(int i=0;i<chuoi.length();i++){
            if(chuoi.charAt(i) >=0&&chuoi.charAt(i)<=9){
                count++;
            }
        }
        System.out.println("Có "+ count +"ký tự số trong chuỗi");
        scanner.close();
    }  
}
