package udemy.OOP1.OOP1Challange;

public class Vehicle {
    private int steering;
    private int changingGears;
    private int moving;


    public Vehicle(int steering, int changingGears, int moving) {
        this.steering=steering;
        this.changingGears=changingGears;
        this.moving=moving;

    }


    public void changeGears(){
        System.out.println("change gears");
    }
    public void move(int speed){
        System.out.println("moving at " + speed + " km/h");
    }

    public int getSteering() {
        return steering;
    }

    public void setSteering(int steering) {
        this.steering = steering;
    }

    public int getChangingGears() {
        return changingGears;
    }

    public void setChangingGears(int changingGears) {
        this.changingGears = changingGears;
    }

    public int getMoving() {
        return moving;
    }

    public void setMoving(int moving) {
        this.moving = moving;
    }

}
