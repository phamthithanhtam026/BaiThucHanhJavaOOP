package Shape;

import java.util.Scanner;

public class Triangle extends Point {
    public void doDai(Point diemA, Point diemB){
        
        double doDai;
        doDai = Math.sqrt(Math.pow((diemB.hoanhDo-diemA.hoanhDo),2)+Math.pow((diemB.tungDo-diemA.tungDo),2));
    }
    
   public static void main(String[] args) {
       Triangle triangle = new Triangle();
       triangle.doDai(diemA(0,0), diemB(0,3));
   }
private static Point diemB(int i, int j) {
    return diemB(i, j);
}
private static Point diemA(int i, int j) {
   return diemA(i, j);
}


}
