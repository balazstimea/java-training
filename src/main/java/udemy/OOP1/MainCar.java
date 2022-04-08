package udemy.OOP1;

public class MainCar {
    public static void  main(String[] args){
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Porsche");
        System.out.println("Model is " + porsche.getModel());

    }
}
