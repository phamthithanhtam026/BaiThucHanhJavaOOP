import java.util.Scanner;
public class App9 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
     int n=scanner.nextInt();
    int res = 0;
    while(n>0){
        int tmp = n % 10;
        res = res*10+tmp;
        n = n/10;
    }
    System.out.println(+res);
}
}

