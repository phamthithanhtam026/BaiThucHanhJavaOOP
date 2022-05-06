import java.util.ArrayList;

public class App16 {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<>();
        arrayListString.add("Java");
        arrayListString.add("PHP");
        arrayListString.add("C#");
        arrayListString.add("C++");
        System.out.println("Cac phan tu co trong arrayListString la: ");
        for(int i=0;i<arrayListString.size();i++){
            System.out.println(arrayListString.get(i)+"\t");
        }
        arrayListString.add(2,"Python");
        System.out.println("Cac phan tu co trong arrayListString la: ");{
            for(int i=0;i<arrayListString.size();i++){
                System.out.println(arrayListString.get(i)+"\t");
            }
        }
        arrayListString.set(3,"C");
        System.out.println("Cac phan tu co trong arrayListString la: ");{
            for(int i=0;i<arrayListString.size();i++){
                System.out.println(arrayListString.get(i));
            }
        }
        arrayListString.remove(2);
        System.out.println("Cac phan tu co trong arrayListString la: ");{
            for(int i=0;i<arrayListString.size();i++){
                System.out.println(arrayListString.get(i));
            }
        }
        
    }   

}
    

