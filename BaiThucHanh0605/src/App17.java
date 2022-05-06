import java.util.ArrayList;

public class App17 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        arrayListInteger.add(0);
        arrayListInteger.add(7);
        arrayListInteger.add(1);
        arrayListInteger.add(9);
        System.out.println("Cac phan tu co trong arrayListInteger la: ");{
            for(int number : arrayListInteger){
                System.out.println(number+"\t");
            }
        }
    }
    
}
