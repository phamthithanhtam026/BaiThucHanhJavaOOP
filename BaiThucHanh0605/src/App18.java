import java.util.ArrayList;
import java.util.Iterator;

public class App18 {
    public static void main(String[] args) {
        ArrayList<Float> arrayListFloat = new ArrayList<>();
        arrayListFloat.add(0.7f);
        arrayListFloat.add(7.25f);
        arrayListFloat.add(1.5f);
        arrayListFloat.add(8.5f);
        // khai báo một Iterator có kiểu Float
        Iterator<Float> iterator = arrayListFloat.iterator();{
            System.out.println("Cac phan tu co trong arrayListFloat la:");
            while(iterator.hasNext()){
                System.out.println(iterator.next()+"\t");
            }
        }
    }
    
}
