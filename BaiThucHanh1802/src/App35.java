import java.util.Scanner;
public class App35 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        int a = scanner.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        int b = scanner.nextInt();
        if(a == b){
        System.out.println("Hai so bang nhau!");
    }
        else if(a < b){
        System.out.println("Min cua hai so "+a+"va"+b+"la: "+a);
    }
    else{
        System.out.println("Min cua hai so "+a+"va"+b+"la: "+b);
    }
    }
}
