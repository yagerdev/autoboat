public class Boat extends Vehicle {

    public Boat(String brand) {
        super(brand);
        // TODO Auto-generated constructor stub
    }
    @Override
    public String doStuff(){
        return"Je suis "+getBrand()+" et je fais glou glou !";
    }

}