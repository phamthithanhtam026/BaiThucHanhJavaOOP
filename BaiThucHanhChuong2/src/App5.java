import java.util.Scanner;
public class App5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number,sum=0;
        while(sum>100){
        System.out.println("Nhập vào một số nguyên bất kỳ: ");
        number = scanner.nextInt();
        sum+=number;
        }
        System.out.println("Tổng các số nguyên vừa nhập là: "+sum);
        scanner.close();
    }    
}
