public class EX22 extends B{
    public static void main(String[] args) {
        B b = new B();
        b.Display();
    }
}

class A{

    protected static int x=10;

}
class B extends A{
    
   private int x=20;

    public void Display()
    {
        System.out.println("X Of A Class:"+super.x);
        
        System.out.println("X Of B Class:"+x);
        
    }

}