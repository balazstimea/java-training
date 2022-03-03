package udemy.OOP1.OOP1Challange;

public class RaceCar extends Car{

    private int raceNumber;

    public RaceCar(int raceNumber,String model, int steering, int ChangingGears, int moving) {
        super(model, steering, ChangingGears, moving);
        this.raceNumber = raceNumber;
    }

    public int getRaceNumber() {
        return raceNumber;
    }

    public void setRaceNumber(int raceNumber) {
        this.raceNumber = raceNumber;
    }
}
