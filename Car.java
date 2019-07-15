public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
        // TODO Auto-generated constructor stub
    }
    @Override
    public String doStuff(){
        return"Je suis "+getBrand()+" et je fais vroom vroom !";
    }

}