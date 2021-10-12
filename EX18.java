public class EX18 extends Car{
    public static void main(String[] args) {
        Car car =new Car("Alto800", "Maruti Suzuki","Car");
        car.Display();   
    }
}

class Vehicle{

    private String vehicle_type;

    Vehicle(String vehicle_type)
    {
        this.vehicle_type=vehicle_type;
    }

    protected void Display()
    {

        System.out.println("Vehicle Type Is :"+vehicle_type);
    }

}
class Car extends Vehicle{

    private String model_type,company_name;
    

    Car(String model_type,String company_name,String v)
    {
            super(v);    
            this.model_type=model_type;
            this.company_name=company_name;
    }

    protected void Display(){
        super.Display();
        System.out.println("Model Type is:"+model_type);
        System.out.println("Company Name is:"+company_name);
    }
    
    
}
