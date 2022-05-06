abstract public class Animal {
    abstract void Eat();
    abstract void Sleep();
    abstract void Walk();
    abstract void Run();
    abstract void Roar();
    class Tiger extends Animal{
        void Eat(){
            System.out.println("Hổ ăn thịt");
        }
        void Sleep(){

        }
        void Walk(){

        }
        void Run(){

        }
        void Roar(){

        }
    }
    public static void main(String[] args) {
        Animal obj = new Tiger();
        obj.Eat();
        obj.Sleep();
        obj.Walk();
        obj.Run();
        obj.Roar();
    }
    
}
