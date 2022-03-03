package udemy.OOP1.OOP1Challange;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle(1,6,200);
        Car car = new Car("vw", 1,5, 180);
        RaceCar racecar = new RaceCar(17,"mustang",1,6, 220);
        vehicle.changeGears();
        vehicle.move(200);

    }
}
