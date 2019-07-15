public class Hangar {

    public static void main(String[] args) {
     Car peugeot = new Car("Peugeot");
    
     System.out.println(peugeot.doStuff());
    
     Boat yackt = new Boat("Yackt");
     System.out.println(yackt.doStuff());
        
    }
}