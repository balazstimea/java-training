package udemy.OOP1.OOP1Challange;

public class Car extends Vehicle{

    private String model;


    public Car(String model, int steering, int ChangingGears, int moving) {
        super(1,6,200);
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
