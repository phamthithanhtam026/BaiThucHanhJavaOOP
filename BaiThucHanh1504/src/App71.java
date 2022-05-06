public class App71 {
    public class ToaDo{
        private int x;
        private int y;
        public int getX(){
            return x;
        }
        public void setX(int x){
            this.x = x;
        }
        public int getY(){
            return y;
        }
        public void setY(int y){
            this.y = y;
        }
        public class HinhTron{
            public final float PI = 3.14f;
            public float Bankinh;
            public float getBankinh(){
                return Bankinh;
            }
            public float setBankinh(float bankinh){
                this.Bankinh = Bankinh;
            }
            public float tinhchuvi(){
                return (2*PI*Bankinh);
            }
            public float tinhdientich(){
                return (PI*Bankinh*Bankinh);
            }
        }
    }
    public static void main(String[] args) {
        HinhTron hinhtron = new HinhTron();
        hinhtron.setBankinh(10);
        float chuvi = hinhtron.tinhchuvi();
        float dientich = hinhtron.tinhdientich();
        System.out.println("Chu vi hình tròn "+chuvi+ "diện tích là: "+dientich);
    }
    
}
