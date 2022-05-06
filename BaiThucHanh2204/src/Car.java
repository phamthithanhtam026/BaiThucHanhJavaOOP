interface  Car {
    void Move();
    void Stop();
    void TurnRight();
    void TurnLeft();
    void Reserve();
    class TaxiCar implements Car{
        public void Move(){
            System.out.println("Xe taxi đang di chuyển");
        }
        public void Stop(){
            System.out.println("Xe taxi đang dừng lại");
        }
        public void TurnLeft(){
            System.out.println("Xe taxi đang rẽ trái");
        }
        public void TurnRight(){
            System.out.println("Xe taxi đang rẽ phải");
        }
        public void Reserve(){
            System.out.println("Xe taxi đang chuẩn bị khởi hành: ");
        }
    }
    public static void main(String[] args) {
        TaxiCar obj = new TaxiCar();
        obj.Move();
        obj.Stop();
        obj.TurnLeft();
        obj.TurnRight();
        obj.Reserve();
    }  
}
