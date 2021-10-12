public class EX17 extends Circle{
    

    public static void main(String[] args) {

    Circle circle;
    circle=new Circle(15);
    System.out.println("Radius is "+Circle.count+" Object:"+circle.getRadius());
   
    circle=new Circle(10);
    System.out.println("Radius is "+Circle.count+" Object:"+circle.getRadius());
    



    }
}

class Circle{

    static int count=0;
    private int radius;
    
    Circle() {
        count++;
    }

    Circle(int radius)
    {
        this();
        this.radius=radius;
    }

    protected int getRadius() {
        return radius;
    }


}